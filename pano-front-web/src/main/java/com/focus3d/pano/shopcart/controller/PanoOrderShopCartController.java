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
import com.focus3d.pano.shopcart.service.PanoOrderShopCartService;
import com.focustech.common.utils.EncryptUtil;
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

	/**
	 * 购物车列表
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
	 * 添加套餐到购物车
	 * *
	 * @param packageEncryptSn
	 * @throws Exception 
	 */
	@RequestMapping(value = "add", method = RequestMethod.GET)
	public void add(String packageEncryptSn, HttpServletResponse response) throws Exception{
		if(StringUtils.isNotEmpty(packageEncryptSn)){
			Long packageSn = EncryptUtil.decode(packageEncryptSn);
			int status = orderShopCartService.addOrDelete(packageSn);
			JSONObject jo = new JSONObject();
			jo.put("status", status);
			ajaxOutput(response, jo.toString());
		}
	}
}
