package com.focus3d.pano.shopcart.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.focus3d.pano.common.controller.BaseController;
import com.focus3d.pano.filter.LoginThreadLocal;
/**
 * 
 * *
 * @author lihaijun
 *
 */
@Controller
@RequestMapping(value = "/shopcart")
public class ShopCartController extends BaseController {
	
	/**
	 * 
	 * *
	 * @param request
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public String list(HttpServletRequest request,HttpSession session){
		//查询显示在购物车里的属性信息
		Long userSn = LoginThreadLocal.getLoginInfo().getUserSn();
		//List<AddToCar> addToCarList=usersSideService.get_selectAddToCar2(userSn);
		//System.out.println("addToCarList:"+addToCarList);
		//request.setAttribute("addToCarList",addToCarList);
		return "/member/shopcart/list";
	}
}
