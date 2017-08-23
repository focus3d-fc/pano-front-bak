package com.focus3d.pano.index.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.focus3d.pano.common.controller.BaseController;
import com.focus3d.pano.model.OrderRelevance;
import com.focus3d.pano.model.pano_mem_user;
import com.focus3d.pano.model.pano_order;
import com.focus3d.pano.model.pano_user_receive_address;
import com.focus3d.pano.usersside.service.PersonalService;

/**
 * 
 * 个人中心方法
 * 
 * 
 */
@Controller
@RequestMapping("/personal")
public class PersonalController extends BaseController {

	@Autowired
	private PersonalService personalService;

	// --------------------------------------------个人中心--------------------------------------------

	Long USER_SN;

	/**
	 * 进入到个人中心
	 */
	@RequestMapping("/tomy")
	public String tomy(HttpServletRequest request) {
		USER_SN = Long.parseLong(request.getParameter("SN"));
		pano_mem_user memuser = personalService.selUserbySN(USER_SN);
		request.setAttribute("memuser", memuser);
		return "/userside/my";
	}

	/**
	 * 进入到个人中心2
	 */
	@RequestMapping("/tomy2")
	public String tomy2(HttpServletRequest request) {
		pano_mem_user memuser = personalService.selUserbySN(USER_SN);
		request.setAttribute("memuser", memuser);
		return "/userside/my";
	}

	// --------------------------------------------收货地址--------------------------------------------

	/**
	 * 进入到收货地址
	 */
	@RequestMapping("/toaddress")
	public String toaddress(HttpServletRequest request) {
		USER_SN = Long.parseLong(request.getParameter("USER_SN"));
		List<pano_user_receive_address> address = personalService
				.selAddressbyUserSN(USER_SN);
		request.setAttribute("address", address);
		return "/userside/address";
	}

	/**
	 * 进入到收货地址2
	 */
	@RequestMapping("/toaddress2")
	public String toaddress2(HttpServletRequest request) {
		List<pano_user_receive_address> address = personalService
				.selAddressbyUserSN(USER_SN);
		if (request.getParameter("he").equals("he")) {
			personalService.upAddres();
		}
		request.setAttribute("address", address);
		return "/userside/address";
	}

	/**
	 * 删除收货地址
	 */
	@RequestMapping("/delSite")
	public String delSite(HttpServletRequest request) {
		Long SN = Long.parseLong(request.getParameter("SN"));
		personalService.delAddress(SN);
		return redirect("toaddress2");
	}

	/**
	 * 进入到添加地址
	 */
	@RequestMapping("/toaddaddress")
	public String toaddaddress() {
		return "/userside/addaddress";
	}

	/**
	 * 添加收货地址
	 */
	@RequestMapping("/addSite")
	public String addSite(HttpServletRequest request,
			@RequestParam String USER_NAME, @RequestParam String MOBILE,
			@RequestParam String cityResult3, @RequestParam String STREET) {
		pano_user_receive_address site = new pano_user_receive_address();
		site.setUSER_NAME(USER_NAME);
		site.setMOBILE(MOBILE);
		String[] arr = cityResult3.split("\\s+");
		site.setPROVINCE(arr[0]);
		site.setCITY(arr[1]);
		site.setAREA(arr[2]);
		site.setSTREET(STREET);
		site.setUSER_SN(USER_SN);
		pano_mem_user memuser = personalService.selUserbySN(USER_SN);
		site.setSEX(memuser.getSEX());
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String add_time = sdf.format(date);
		site.setADD_TIME(add_time);
		personalService.addAddress(site);
		return redirect("toaddress2");
	}

	/**
	 * 进入到编辑地址
	 */
	@RequestMapping("/toupAddress")
	public String toupAddress(HttpServletRequest request) {
		Long SN = Long.parseLong(request.getParameter("SN"));
		pano_user_receive_address address = personalService.selAddressbySN(SN);
		request.setAttribute("address", address);
		return "/userside/upaddress";
	}

	/**
	 * 修改收货地址
	 */
	@RequestMapping("/upSite")
	public String upSite(HttpServletRequest request,
			@RequestParam String USER_NAME, @RequestParam String MOBILE,
			@RequestParam String cityResult3, @RequestParam String STREET,
			@RequestParam String SN) {

		pano_user_receive_address site = new pano_user_receive_address();
		site.setUSER_NAME(USER_NAME);
		site.setMOBILE(MOBILE);

		String temp = cityResult3.replaceAll("\u00A0", " ");

		String[] arru = temp.split("\\s+");

		site.setPROVINCE(arru[0]);
		site.setCITY(arru[1]);
		site.setAREA(arru[2]);

		site.setSTREET(STREET);
		Long SiteSN = Long.parseLong(SN);
		site.setSN(SiteSN);

		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String add_time = sdf.format(date);
		site.setUPDATE_TIME(add_time);
		personalService.upAddress(site);
		return redirect("toaddress2");
	}

	/**
	 * 修改收货地址默认状态
	 */
	@RequestMapping("/setDef")
	public String setDef(HttpServletRequest request) {
		Long ADDRESS_SN = Long.parseLong(request.getParameter("SN"));

		pano_user_receive_address address = personalService
				.selAddressbySN(ADDRESS_SN);

		if (address.getDEFAULT() == 0) {

			List<pano_user_receive_address> addressed = personalService
					.selAddressbyDef(address.getUSER_SN());
			pano_user_receive_address aed = new pano_user_receive_address();
			aed.setSN(addressed.get(0).getSN());
			aed.setDEFAULT(0);
			personalService.upDef(aed);

			pano_user_receive_address a = new pano_user_receive_address();
			a.setSN(address.getSN());
			a.setDEFAULT(1);
			personalService.upDef(a);
		}

		return redirect("toaddress2");
	}

	// --------------------------------------------实名认证--------------------------------------------

	/**
	 * 进入实名认证
	 */
	@RequestMapping("/tocer")
	public String tocer(HttpServletRequest request) {
		Long SN = Long.parseLong(request.getParameter("SN"));
		pano_mem_user memuser = personalService.selUserbySN(SN);
		request.setAttribute("memuser", memuser);
		return "/userside/cer";
	}

	/**
	 * 修改身份信息
	 */
	@RequestMapping("/upCert")
	public String upCert(HttpServletRequest request, @RequestParam String SN,
			@RequestParam String NAME, @RequestParam String SEX,
			@RequestParam String CERT_NO) {
		Long USER_SN = Long.parseLong(SN);
		int USER_SEX = Integer.parseInt(SEX);
		pano_mem_user memuser = new pano_mem_user();
		memuser.setSN(USER_SN);
		memuser.setNAME(NAME);
		memuser.setSEX(USER_SEX);
		memuser.setCERT_NO(CERT_NO);
		personalService.upMemuser(memuser);
		return redirect("tomy2");
	}

	// --------------------------------------------订单--------------------------------------------

	/**
	 * 进入全部订单
	 */
	@RequestMapping("/toorderAll")
	public String toorderAll(HttpServletRequest request) {
		List<OrderRelevance> orderList = personalService
				.selOrderbyUser(USER_SN);
		request.setAttribute("orderList", orderList);
		return "/userside/orderAll";
	}

	/**
	 * 进入待付款
	 */
	@RequestMapping("/topaying")
	public String topaying(HttpServletRequest request) {
		List<OrderRelevance> orderList = personalService
				.selOrderbyUser2(USER_SN);
		request.setAttribute("orderList", orderList);
		return "/userside/paying";
	}

	/**
	 * 进入已付款
	 */
	@RequestMapping("/topaid")
	public String topaid(HttpServletRequest request) {
		List<OrderRelevance> orderList = personalService
				.selOrderbyUser3(USER_SN);
		request.setAttribute("orderList", orderList);
		return "/userside/paid";
	}

	Long ORDER_SN_CONFIRM;

	/**
	 * 进入支付
	 */
	@RequestMapping("/toconfirm")
	public String toconfirm(HttpServletRequest request) {
		List<pano_user_receive_address> address = personalService
				.selAddressbyDef(USER_SN);
		request.setAttribute("address", address.get(0));
		ORDER_SN_CONFIRM = Long.parseLong(request.getParameter("ORDER_SN"));
		List<OrderRelevance> orderList = personalService
				.selOrderbySN(ORDER_SN_CONFIRM);
		request.setAttribute("orderList", orderList.get(0));
		return "/userside/confirm";
	}

	/**
	 * 进入支付2
	 */
	@RequestMapping("/toconfirm2")
	public String toconfirm2(HttpServletRequest request) {
		List<pano_user_receive_address> address = personalService
				.selAddressbyDef(USER_SN);
		request.setAttribute("address", address.get(0));
		List<OrderRelevance> orderList = personalService
				.selOrderbySN(ORDER_SN_CONFIRM);
		request.setAttribute("orderList", orderList.get(0));
		return "/userside/confirm";
	}

	// --------------------------------------------支付--------------------------------------------

	/**
	 * 支付成功
	 */
	@RequestMapping("/paysuccess")
	public String paysuccess(HttpServletRequest request, HttpSession session) {
		pano_order order = (pano_order) session.getAttribute("order");
		Long SN = order.getSN();
		pano_order uporder = new pano_order();
		uporder.setSN(SN);
		uporder.setSTATUS(3);
		personalService.upOrderStatus(uporder);
		return redirect("toorderAll");
	}

	/**
	 * 支付成功
	 */
	@RequestMapping("/paycancel")
	public String paycancel(HttpServletRequest request, HttpSession session) {
		pano_order order = (pano_order) session.getAttribute("order");
		Long SN = order.getSN();
		pano_order uporder = new pano_order();
		uporder.setSN(SN);
		uporder.setSTATUS(2);
		personalService.upOrderStatus(uporder);
		return redirect("topaying");
	}
}
