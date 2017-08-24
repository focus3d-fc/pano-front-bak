package com.focus3d.pano.shopcart.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.focus3d.pano.common.controller.BaseController;
import com.focus3d.pano.filter.LoginThreadLocal;
import com.focus3d.pano.model.PanoOrderPackageDetailModel;
import com.focus3d.pano.model.PanoOrderShopcartDetailModel;
import com.focus3d.pano.model.PanoOrderShopcartModel;
import com.focus3d.pano.model.PanoProductModel;
import com.focus3d.pano.model.PanoProjectPackageTypeModel;
import com.focus3d.pano.project.service.PanoProjectPackageTypeService;
import com.focus3d.pano.shopcart.service.PanoOrderShopCartService;
import com.focustech.common.utils.EncryptUtil;
import com.focustech.common.utils.ListUtils;
import com.focustech.common.utils.StringUtils;
/**
 * 购物车
 * *
 * @author lihaijun
 *
 */
@Controller
@RequestMapping(value = "/shopcart")
public class PanoOrderShopCartController extends BaseController {
	@Autowired
	private PanoOrderShopCartService<PanoOrderShopcartModel> orderShopCartService;
	@Autowired
	private PanoProjectPackageTypeService<PanoProjectPackageTypeModel> packageTypeService;

	/**
	 * 
	 * *
	 * @param request
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public String list(ModelMap modelMap, HttpServletRequest request){
		Long userSn = LoginThreadLocal.getLoginInfo().getUserSn();
		List<PanoOrderShopcartModel> shopcartList = orderShopCartService.listByUser(userSn);
		modelMap.put("shopcartList", shopcartList);
		return "/member/shopcart/list";
	}
	/**
	 * 
	 * *
	 * @param packageEncryptSn
	 * @throws Exception 
	 */
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public void add(String packageEncryptSn) throws Exception{
		if(StringUtils.isNotEmpty(packageEncryptSn)){
			Long userSn = LoginThreadLocal.getLoginInfo().getUserSn();
			Long packageSn = EncryptUtil.decode(packageEncryptSn);
			List<PanoProjectPackageTypeModel> housePackageTypeList = packageTypeService.listByHousePackage(packageSn);
			PanoOrderShopcartModel shopcartModel = new PanoOrderShopcartModel();
			shopcartModel.setUserSn(userSn);
			shopcartModel.setHousePackageSn(packageSn);
			int housePackageNum = 0;
			//套餐类别
			List<PanoOrderShopcartDetailModel> orderShopcartDetails = new ArrayList<PanoOrderShopcartDetailModel>();
			for (PanoProjectPackageTypeModel housePackageType : housePackageTypeList) {
				//取类别下第一条产品
				List<PanoProductModel> products = housePackageType.getProducts();
				if(ListUtils.isNotEmpty(products)){
					housePackageNum ++;
					PanoProductModel product = products.get(0);
					/*PanoOrderPackageDetailModel orderPackageDetailModel = new PanoOrderPackageDetailModel();
					orderPackageDetailModel.setPackageProductSn(product.getSn());
					orderPackageDetailModel.setPackageTypeSn(housePackageType.getSn());
					orderPackageDetailModel.setHousePackageSn(packageSn);
					orderShopcartDetails.add(orderPackageDetailModel);*/
				}
			}
			shopcartModel.setPackageTypeNum(housePackageNum);
			orderShopCartService.insert(shopcartModel);
		}
	}
}
