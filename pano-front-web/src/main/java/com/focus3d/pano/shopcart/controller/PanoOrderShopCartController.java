package com.focus3d.pano.shopcart.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.focus3d.pano.common.controller.BaseController;
import com.focus3d.pano.filter.LoginThreadLocal;
import com.focus3d.pano.model.PanoOrderShopcartDetailModel;
import com.focus3d.pano.model.PanoOrderShopcartModel;
import com.focus3d.pano.model.PanoProjectHousePackageModel;
import com.focus3d.pano.model.PanoProjectHouseStyleModel;
import com.focus3d.pano.model.PanoProjectPackageTypeModel;
import com.focus3d.pano.project.service.PanoProjectHousePackageService;
import com.focus3d.pano.project.service.PanoProjectHouseStyleService;
import com.focus3d.pano.project.service.PanoProjectPackageTypeService;
import com.focus3d.pano.shopcart.service.PanoOrderShopCartDetailService;
import com.focus3d.pano.shopcart.service.PanoOrderShopCartService;
import com.focustech.common.utils.EncryptUtil;
import com.focustech.common.utils.HttpUtil;
import com.focustech.common.utils.StringUtils;
import com.focustech.common.utils.TCUtil;

/**
 * 购物车 *
 * 
 * @author lihaijun
 * 
 */
@Controller
@RequestMapping(value = "/shopcart")
public class PanoOrderShopCartController extends BaseController {
	@Autowired
	private PanoOrderShopCartService<PanoOrderShopcartModel> orderShopCartService;
	@Autowired
	private PanoOrderShopCartDetailService<PanoOrderShopcartDetailModel> orderShopCartDetailService;
	@Autowired
	private PanoProjectHousePackageService<PanoProjectHousePackageModel> housePackageService;
	@Autowired
	private PanoProjectPackageTypeService<PanoProjectPackageTypeModel> packageTypeService;
	@Autowired
	private PanoProjectHouseStyleService<PanoProjectHouseStyleModel> houseStyleService;
	/**
	 * 购物车列表 *
	 * 
	 * @param request
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public String list(String styleId, ModelMap modelMap, HttpServletRequest request) {
		Long userSn = LoginThreadLocal.getLoginInfo().getUserSn();
		//透视图状态信息
		setPerspectiveStatus(modelMap, request);
		List<PanoOrderShopcartModel> shopcartList = orderShopCartService.listByUser(userSn);
		for (PanoOrderShopcartModel panoOrderShopcartModel : shopcartList) {
			Long housePackageSn = panoOrderShopcartModel.getHousePackageSn();
			PanoProjectHousePackageModel housePackage = housePackageService.getDetail(housePackageSn);
			if (housePackage != null) {
				panoOrderShopcartModel.setHousePackage(housePackage);
			}
		}
		modelMap.put("shopcartList", shopcartList);
		if(StringUtils.isNotEmpty(styleId)){
			modelMap.put("styleId", styleId);
		}
		return "/member/shopcart/list";
	}
	/**
	 * 
	 * *
	 * @param modelMap
	 * @param request
	 */
	private void setPerspectiveStatus(ModelMap modelMap, HttpServletRequest request) {
		Long userSn = LoginThreadLocal.getLoginInfo().getUserSn();
		//购物车状态记录,类别下面产品更换
		String productSn = HttpUtil.sv(request, "productSn");
		String packageTypeSn = HttpUtil.sv(request, "packageTypeSn");
		String houseStyleSn = HttpUtil.sv(request, "houseStyleSn");
		if(StringUtils.isNotEmpty(productSn)){
			PanoProjectPackageTypeModel packageTypeModel = packageTypeService.getBySn(TCUtil.lv(packageTypeSn));
			Long housePackageSn = packageTypeModel.getHousePackageSn();
			PanoOrderShopcartModel shopcart = orderShopCartService.getUserShopcartPackage(userSn, housePackageSn);
			PanoOrderShopcartDetailModel shopcartDetail = orderShopCartDetailService.getByAttribute(shopcart.getSn(), TCUtil.lv(packageTypeSn));
			Long oldProductSn = shopcartDetail.getPackageProductSn();
			if(shopcartDetail != null && !TCUtil.sv(oldProductSn).equals(productSn)){
				shopcartDetail.setPackageProductSn(TCUtil.lv(productSn));
				orderShopCartDetailService.update(shopcartDetail);
			}
			PanoProjectHouseStyleModel houseStyle = houseStyleService.getBySn(TCUtil.lv(houseStyleSn));
			modelMap.put("styleId", houseStyle.getStyleSn());
			JSONObject rememberStatus = new JSONObject();
			rememberStatus.put("housePackageSn", housePackageSn);
			rememberStatus.put("productSn", productSn);
			rememberStatus.put("packageTypeSn", packageTypeSn);
			modelMap.put("rememberStatus", rememberStatus);
		}
	}

	/**
	 * 添加套餐到购物车 *
	 * 
	 * @param packageEncryptSn
	 * @throws Exception
	 */
	@RequestMapping(value = "add", method = RequestMethod.GET)
	public void add(String packageEncryptSn, HttpServletResponse response) throws Exception {
		if (StringUtils.isNotEmpty(packageEncryptSn)) {
			Long packageSn = EncryptUtil.decode(packageEncryptSn);
			int status = orderShopCartService.addOrDelete(packageSn);
			JSONObject jo = new JSONObject();
			jo.put("status", status);
			ajaxOutput(response, jo.toString());
		}
	}
}
