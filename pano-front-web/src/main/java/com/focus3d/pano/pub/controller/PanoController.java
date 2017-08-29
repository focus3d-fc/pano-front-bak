package com.focus3d.pano.pub.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.focus3d.pano.common.controller.BaseController;
import com.focus3d.pano.model.PanoProjectModel;
import com.focus3d.pano.model.PanoProjectPackage;
import com.focus3d.pano.model.PanoProjectStyleModel;
import com.focus3d.pano.model.panoSkin;
import com.focus3d.pano.model.pano_project_house;
import com.focus3d.pano.project.service.PanoProjectService;
import com.focus3d.pano.project.service.PanoProjectStyleService;
import com.focus3d.pano.usersside.service.UsersSideService;
/**
 * 
 * *
 * @author lihaijun
 *
 */
@Controller
@RequestMapping(value = "/fp")
public class PanoController extends BaseController {
	@Autowired
	private UsersSideService usersSideService;
	@Autowired
	private PanoProjectStyleService<PanoProjectStyleModel> projectStyleService;
	@Autowired
	private PanoProjectService<PanoProjectModel> projectService;
	
	/**
	 * 
	 * *
	 * @param request
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/720")
	public String to720(HttpServletRequest request,HttpSession session, ModelMap modelMap){
		long style_id_str = 0L;
		if(request.getParameter("style_id") != null){
			style_id_str= Long.parseLong(request.getParameter("style_id"));
		}
		request.setAttribute("style_id",style_id_str);
		//获取到style_id
		long style_id=style_id_str;
		session.setAttribute("style_id",style_id);
		//-------------------------------------------------------------------------------------------
		//获取户型
		List<pano_project_house> houseList=usersSideService.get_selectHouseListByStyle_sn(style_id);
		if(houseList.size()>0){
			long house_sn=houseList.get(0).getSN();
			List<PanoProjectPackage> packageList=usersSideService.list_selectPackageByHouse_sn(house_sn);
			//session.setAttribute("packageList",packageList);
			//session.setAttribute("house_sn",house_sn);
		}
		//获取导航图
		List<panoSkin> panoSkinList=usersSideService.list_selectPanoSkinList();
		String skinName="";
		long img_tc=0;
		long img_space=0;
		long img_house=0;
		long img_cart=0;
		for(int i=0;i<panoSkinList.size();i++){
			skinName=panoSkinList.get(i).getName();
			if(skinName.equals("套餐")){
				img_tc=panoSkinList.get(i).getImg_sn();
			}else if(skinName.equals("房间")){
				img_space=panoSkinList.get(i).getImg_sn();
			}else if(skinName.equals("户型")){
				img_house=panoSkinList.get(i).getImg_sn();
			}else if(skinName.equals("购物车")){
				img_cart=panoSkinList.get(i).getImg_sn();
			}
		}
		request.setAttribute("img_tc",img_tc);
		request.setAttribute("img_space",img_space);
		request.setAttribute("img_house",img_house);
		request.setAttribute("img_cart",img_cart);
		PanoProjectStyleModel projectStyle = projectStyleService.getBySn(style_id);
		Long projectSn = projectStyle.getProjectSn();
		PanoProjectModel project = projectService.getBySn(projectSn);
		modelMap.put("project", project);
		return "/pub/720";
	}
}
