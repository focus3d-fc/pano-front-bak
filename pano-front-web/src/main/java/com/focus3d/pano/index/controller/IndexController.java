package com.focus3d.pano.index.controller;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

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
import com.focustech.common.utils.HttpUtil;
import com.focustech.common.utils.StringUtils;
import com.focustech.common.utils.TCUtil;

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
	public String index(ModelMap modelMap, HttpServletRequest request){
		//模拟登陆状态，方便后面代码获取user_sn
		//根据楼盘信息，查询楼盘sn
		/*String province=request.getParameter("province");
		String city=request.getParameter("city");
		String area=request.getParameter("area");
		String project_name=request.getParameter("project_name");*/
		String checkProjectSn = HttpUtil.sv(request, "checkProjectSn");
		//查询全部楼盘，默认第一个楼盘显示首页
		List<pano_project> pano_projectList = usersSideService.get_projectList();
		pano_project pano_project = null;
		if(StringUtils.isEmpty(checkProjectSn)){
			//默认首页显示数据库里第一个楼盘
			pano_project = pano_projectList.get(0);
		} else {
			//条件查询
			for (pano_project project : pano_projectList) {
				if(TCUtil.sv(project.getSn()).equals(checkProjectSn)){
					pano_project = project;
					break;
				}
			}
		}
		long project_sn = pano_project.getSN();
		/*if((province!=null)&&(city!=null)&&(area!=null)&&(project_name!=null)){
			//其实这里应该只有一个元素，为了防止添加楼盘时没验证唯一，性导致这里会报错才查的集合
			pano_projectList=usersSideService.list_SelectprojectList2( province, city, area, project_name);
			project_sn = pano_projectList.get(0).getSN();
		}*/
		modelMap.addAttribute("pano_projectList", pano_projectList);
		//查询   楼盘sn(100007)-风格styleList     *project_sn:100012***此事还要关联户型表查询house_sn
		List<Style> styleList;
		try {
			styleList = usersSideService.selectStyleByProject_sn(project_sn);
			modelMap.addAttribute("styleList",styleList);
			List<pano_ad> adList=usersSideService.selectAdImg_sn(project_sn);
			modelMap.addAttribute("adList",adList);
			//根据每个风格-查询对应的-标签集合
			Set<Long>  set=new HashSet<Long>();
			Iterator<Style> style_iterator = styleList.iterator();    
		    while (style_iterator.hasNext()) {    
		        Style style = style_iterator.next();
				Long style_sn=style.getId();
				if(set.contains(style_sn)){
					style_iterator.remove();
					continue;
				}else{
					set.add(style_sn);
					List<Lable> lableList=usersSideService.selectLableByStyle_sn(style_sn);
					style.setLableList(lableList);
				}
		    }    
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "/pub/index";
	}
	
}
