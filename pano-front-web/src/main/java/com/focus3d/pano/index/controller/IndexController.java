package com.focus3d.pano.index.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.focus3d.pano.common.controller.BaseController;
import com.focus3d.pano.model.Lable;
import com.focus3d.pano.model.Style;
import com.focus3d.pano.model.pano_ad;
import com.focus3d.pano.model.pano_project;
import com.focus3d.pano.usersside.service.UsersSideService;
import com.focus3d.pano.wechat.utils.Constants;
import com.focus3d.pano.wechat.utils.UserInfo;

/**
 * 
 * *
 * @author lihaijun
 *
 */
@Controller
@RequestMapping(value = "/index")
public class IndexController extends BaseController{
	@Autowired
	private UsersSideService usersSideService;
	/**
	 * *
	 * @param id
	 * @param modelMap
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap model, HttpServletRequest request,HttpSession session){

		//微信用户对象信息
		UserInfo userInfo = (UserInfo)session.getAttribute(Constants.SESSION_WX_USER);
		//模拟登陆状态，方便后面代码获取user_sn
		long user_sn=1;
		session.setAttribute("user_sn",user_sn);
		
		//从广告表取img_sn集合
		System.out.println("进入/toIndex方法");
		
		List<pano_ad> adList=usersSideService.selectAdImg_sn();
		for(int i=0;i<adList.size();i++){
			System.out.println("广告:"+adList);
		}
		
		model.addAttribute("adList",adList);
		
		//根据楼盘信息，查询楼盘sn
		String province=request.getParameter("province");
		String city=request.getParameter("city");
		String area=request.getParameter("area");
		String project_name=request.getParameter("project_name");
		//System.out.println("province:"+province+",city:"+city+",area:"+area+",project_name:"+project_name);
		//查询全部楼盘，默认第一个楼盘显示首页
		List<pano_project> pano_projectList=usersSideService.get_projectList();
		//System.out.println("项目集合："+pano_projectList);
		//List<pano_project> pano_projectList=null;
		//默认首页显示数据库里第一个楼盘                   long project_sn=100007;
		pano_project pano_project=pano_projectList.get(0);
		long project_sn=pano_project.getSN();
		//long project_sn=100007;
		if((province!=null)&&(city!=null)&&(area!=null)&&(project_name!=null)){
			//其实这里应该只有一个元素，为了防止添加楼盘时没验证唯一，性导致这里会报错才查的集合
			pano_projectList=usersSideService.list_SelectprojectList2(
					province, city, area, project_name);
			project_sn=pano_projectList.get(0).getSN();
		}
		model.addAttribute("pano_projectList",pano_projectList);
		//查询   楼盘sn(100007)-风格styleList     *project_sn:100012***此事还要关联户型表查询house_sn
		System.out.println("1.查询风格集合,当前参数project_sn:"+project_sn);
		List<Style> styleList=usersSideService.selectStyleByProject_sn(project_sn);
		System.out.println("2.查询风格集合");
		System.out.println("风格s："+styleList);
		model.addAttribute("styleList",styleList);
		//根据每个风格-查询对应的-标签集合
		for(int i=0;i<styleList.size();i++){
			Long style_sn=styleList.get(i).getId();
			//System.out.println("风格sn:"+style_sn);
			List<Lable> lableList=usersSideService.selectLableByStyle_sn(style_sn);
			//System.out.println("标签集合,lableList:"+lableList);			
		}
		
		return "/usersside/index";
	
	}
	
}
