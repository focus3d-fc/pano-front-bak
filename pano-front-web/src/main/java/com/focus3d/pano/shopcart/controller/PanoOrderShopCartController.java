package com.focus3d.pano.shopcart.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSONObject;
import com.focus3d.pano.common.controller.BaseController;
import com.focus3d.pano.filter.LoginThreadLocal;
import com.focus3d.pano.model.PanoOrderShopcartModel;
import com.focus3d.pano.model.PanoProjectHousePackageModel;
import com.focus3d.pano.project.service.PanoProjectHousePackageService;
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
	private PanoProjectHousePackageService<PanoProjectHousePackageModel> housePackageService;

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
		List<PanoOrderShopcartModel> shopcartList = orderShopCartService.listByUser(userSn);
		for (PanoOrderShopcartModel panoOrderShopcartModel : shopcartList) {
			Long housePackageSn = panoOrderShopcartModel.getHousePackageSn();
			PanoProjectHousePackageModel housePackage = housePackageService.getDetail(housePackageSn);
			if (housePackage != null) {
				panoOrderShopcartModel.setHousePackage(housePackage);
			}
		}
		modelMap.put("shopcartList", shopcartList);
		modelMap.put("styleId", styleId);
		//购物车状态记录
		
		String checkProductOfTypeSn = HttpUtil.sv(request, "productSn");
		String checkPackageTypeSn = HttpUtil.sv(request, "packageTypeSn");
		return "/member/shopcart/list";
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
