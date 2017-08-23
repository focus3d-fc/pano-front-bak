package com.focus3d.pano.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.focus3d.pano.common.controller.BaseController;
import com.focus3d.pano.filter.LoginThreadLocal;
import com.focus3d.pano.model.PanoMemLoginModel;
import com.focus3d.pano.model.PanoMemUserModel;
import com.focus3d.pano.user.service.PanoMemUserService;

/**
 * 
 * *
 * @author lihaijun
 *
 */
@Controller
@RequestMapping(value = "/member/center")
public class MemberCenterController extends BaseController{
	@Autowired
	private PanoMemUserService<PanoMemUserModel> memUserService;
	/**
	 * 
	 * *
	 * @param request
	 * @param session
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String tomy(HttpServletRequest request,HttpSession session) {
		PanoMemLoginModel loginInfo = LoginThreadLocal.getLoginInfo();
		PanoMemUserModel user = memUserService.getBySn(loginInfo.getUserSn());
		request.setAttribute("memuser", user);
		return "/userside/my";
	}
}
