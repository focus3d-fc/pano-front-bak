package com.focus3d.pano.order.controller;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;
import com.focus3d.pano.common.controller.BaseController;
import com.focus3d.pano.filter.LoginThreadLocal;
import com.focus3d.pano.member.service.PanoUserReceiveAddressService;
import com.focus3d.pano.model.PanoOrderCouponItemModel;
import com.focus3d.pano.model.PanoProjectHousePackageModel;
import com.focus3d.pano.model.PanoUserReceiveAddressModel;
import com.focus3d.pano.model.ibator.PanoPerspectiveViewModel;
import com.focus3d.pano.order.service.PanoOrderCouponItemService;
import com.focus3d.pano.project.service.PanoProjectHousePackageService;

/**
 * 
 * 
 * @author lihaijun
 * 
 */
@Controller
@RequestMapping(value = "/order")
public class PanoOrderController extends BaseController {

	@Autowired
	private PanoProjectHousePackageService<PanoProjectHousePackageModel> housePackageService;
	@Autowired
	private PanoUserReceiveAddressService<PanoUserReceiveAddressModel> receiveAddressService;
	@Autowired
	private PanoOrderCouponItemService<PanoOrderCouponItemModel> panoOrderCouponItemService;
	@RequestMapping("/test")
	public String QueryInfo(PanoPerspectiveViewModel model, ModelMap map) {
		return "/test.html";
	}

	@RequestMapping(value = "/confirmpage")
	public String orderConfirmPage(HttpServletRequest request, ModelMap map)
			throws Exception {
		Long userSn = LoginThreadLocal.getLoginInfo().getUserSn();
		String packageSnsParam = request.getParameter("packageSns");
		String[] packageSns = packageSnsParam.split(",");

		// find packages
		List<PanoProjectHousePackageModel> housePackages = new ArrayList<PanoProjectHousePackageModel>();
		BigDecimal payAmount = BigDecimal.ZERO;
		for (String packageSn : packageSns) {
			PanoProjectHousePackageModel housePackage = housePackageService
					.getDetail(Long.parseLong(packageSn));
			housePackages.add(housePackage);
			payAmount = payAmount.add(housePackage.getPackagePrice());
		}

		// find address and default address
		List<PanoUserReceiveAddressModel> address = receiveAddressService
				.listByUser(userSn);
		PanoUserReceiveAddressModel defaultAddress = null;
		if (address != null && !address.isEmpty()) {
			for (PanoUserReceiveAddressModel addressTmp : address) {
				if (addressTmp.getDefaultFirst() == 1) {
					defaultAddress = addressTmp;
					break;
				}
			}
			if (defaultAddress == null)
				defaultAddress = address.get(0);
		}
		map.put("housePackages", housePackages);
		map.put("address", address);
		map.put("defaultAddress", defaultAddress);
		map.put("payAmount", payAmount);

		return "/member/order/confirm";
	}

	@RequestMapping(value = "/coupon")
	public void coupon(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		String code = request.getParameter("code");
		PanoOrderCouponItemModel panoOrderCouponItemModel =	panoOrderCouponItemService.getByCode(code);
		
		JSONObject jo = new JSONObject();
		jo.put("status", panoOrderCouponItemModel.getStatus());
		jo.put("discountAmount", panoOrderCouponItemModel.getPriceDiscount());
		ajaxOutput(response, jo.toString());
	}
}
