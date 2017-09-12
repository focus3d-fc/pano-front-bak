package com.focus3d.pano.pub.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.focustech.common.utils.HttpUtil;
/**
 * 
 * *
 * @author lihaijun
 *
 */
@Controller
@RequestMapping(value = "/fp")
public class PanoController extends AbstractPanoController {
	/**
	 * 
	 * *
	 * @param request
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/720")
	public String to720(HttpServletRequest request,HttpSession session, ModelMap modelMap){
		long style_id = HttpUtil.iv(request, "style_id");
		String checkProjectSn = HttpUtil.sv(request, "checkProjectSn"); 
		modelMap.put("checkProjectSn", checkProjectSn);
		modelMap.put("style_id", style_id);
		return "/pub/720";
	}
}
