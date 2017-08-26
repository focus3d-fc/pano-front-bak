package com.focus3d.pano.order.controller;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.exception.ExceptionUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.focus3d.pano.common.controller.BaseController;
import com.focus3d.pano.filter.LoginThreadLocal;
import com.focus3d.pano.member.service.PanoUserReceiveAddressService;
import com.focus3d.pano.model.PanoMemUserModel;
import com.focus3d.pano.model.PanoOrderCouponItemModel;
import com.focus3d.pano.model.PanoOrderModel;
import com.focus3d.pano.model.PanoOrderPackageDetailModel;
import com.focus3d.pano.model.PanoOrderPackageModel;
import com.focus3d.pano.model.PanoOrderShopcartDetailModel;
import com.focus3d.pano.model.PanoOrderShopcartModel;
import com.focus3d.pano.model.PanoOrderTransModel;
import com.focus3d.pano.model.PanoProjectHousePackageModel;
import com.focus3d.pano.model.PanoUserReceiveAddressModel;
import com.focus3d.pano.model.PanoValidateModel;
import com.focus3d.pano.model.ibator.PanoPerspectiveViewModel;
import com.focus3d.pano.order.Constant;
import com.focus3d.pano.order.service.PanoOrderCouponItemService;
import com.focus3d.pano.order.service.PanoOrderPackageDetailService;
import com.focus3d.pano.order.service.PanoOrderPackageService;
import com.focus3d.pano.order.service.PanoOrderService;
import com.focus3d.pano.order.service.PanoOrderTransService;
import com.focus3d.pano.project.service.PanoProjectHousePackageService;
import com.focus3d.pano.shopcart.service.PanoOrderShopCartService;
import com.focus3d.pano.sms.service.SmsValidateService;
import com.focus3d.pano.user.service.PanoMemUserService;
import com.focustech.common.codec.encrypter.DefaultEncryptComponentImpl;
import com.focustech.common.utils.EncryptUtil;
import com.lianpay.share.security.Md5Algorithm;
import com.lianpay.share.util.DateUtil;
import com.llpay.client.utils.LLPayUtil;
import com.llpay.client.vo.PayDataBean;
import com.llpay.client.vo.RetBean;
import com.yintong.paywap.domain.PaymentInfo;

/**
 * 
 * 
 * @author lihaijun
 * 
 */
@Controller
@RequestMapping(value = "/order")
public class PanoOrderController extends BaseController {
	private static Logger logger = Logger.getLogger(PanoOrderController.class);
	@Autowired
	private PanoProjectHousePackageService<PanoProjectHousePackageModel> housePackageService;
	@Autowired
	private PanoUserReceiveAddressService<PanoUserReceiveAddressModel> receiveAddressService;
	@Autowired
	private PanoOrderCouponItemService<PanoOrderCouponItemModel> panoOrderCouponItemService;
	@Autowired
	private PanoOrderPackageService<PanoOrderPackageModel> panoOrderPackageService;
	@Autowired
	private PanoOrderService<PanoOrderModel> orderService;
	@Autowired
	private PanoOrderPackageDetailService<PanoOrderPackageDetailModel> panoOrderPackageDetailService;
	@Autowired
	private PanoMemUserService<PanoMemUserModel> panoMemUserService;
	@Autowired
	private PanoOrderTransService<PanoOrderTransModel> panoOrderTransService;
	@Autowired
	private SmsValidateService smsValidateService;
	@Autowired
	private PanoOrderShopCartService<PanoOrderShopcartModel> shopCartService;
	@Autowired
	private PanoOrderShopCartDetailService<PanoOrderShopcartDetailModel> orderShopCartDetailService;
	@RequestMapping("/test")
	public String QueryInfo(PanoPerspectiveViewModel model, ModelMap map) {
		logger.debug(EncryptUtil.encode(10167l));
		return "/test.html";
	}

	@RequestMapping(value = "/topaypage")
	public String toPayPage(HttpServletRequest request, ModelMap map) {
		logger.debug(EncryptUtil.encode(10167l));
		map.put("orderSn", request.getParameter("order_sn"));
		map.put("payAmount", request.getParameter("pay_amount"));
		return "/member/order/pay";
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
					.getDetail(EncryptUtil.decode(packageSn));
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
		PanoOrderCouponItemModel panoOrderCouponItemModel = panoOrderCouponItemService
				.getByCode(code);

		JSONObject jo = new JSONObject();
		if (panoOrderCouponItemModel != null) {
			jo.put("status", panoOrderCouponItemModel.getStatus());
			jo.put("discountAmount",
					panoOrderCouponItemModel.getPriceDiscount());
		}
		ajaxOutput(response, jo.toString());
	}

	@RequestMapping(value = "/phoneexist")
	public void phoneExist(HttpServletRequest request,
			HttpServletResponse response, ModelMap map) throws Exception {
		JSONObject data = new JSONObject();
		try {
			String phone = StringUtils
					.trimToNull(request.getParameter("phone"));

			// if (panoUserService.getByMobile(phone) == null) {
			// data.put("exist", 0);
			// } else {
			// data.put("exist", 1);
			// }
			data.put("exist", 1);
			data.put("status", 0);
		} catch (Exception e) {
			logger.debug(ExceptionUtils.getStackTrace(e));
			data.put("statusMsg", e.getMessage());
			data.put("status", 1);
		}

		ajaxOutput(response, data.toString());
	}

	@RequestMapping(value = "/pay")
	public void pay(HttpServletRequest request, HttpServletResponse response,
			ModelMap map) throws Exception {
		Long userSn = LoginThreadLocal.getLoginInfo().getUserSn();
		String orderSn = StringUtils.trimToNull(request
				.getParameter("order_sn"));
		String payType = StringUtils.trimToNull(request
				.getParameter("pay_type"));
		JSONObject data = new JSONObject();

		try {
			PanoOrderModel orderModel = orderService.getBySn(Long
					.parseLong(orderSn));
			if (orderModel == null)
				throw new RuntimeException("订单不存在");
			if (userSn.compareTo(orderModel.getUserSn()) != 0)
				throw new RuntimeException("不是您的订单");
			if (orderModel.getStatus() == 2)
				throw new RuntimeException("订单已经支付");
			if (orderModel.getPayMoney().compareTo(BigDecimal.ZERO) != 1)
				throw new RuntimeException("订单金额有误");

			PanoMemUserModel panoMemUserModel = panoMemUserService
					.getBySn(orderModel.getUserSn());
			// 根据支付类型组装相应参数
			if ("LIANPAY".equals(payType)) {
				StringBuffer strBuf = new StringBuffer();
				PaymentInfo payInfo = new PaymentInfo();
				// 请求应用标识 1-Android 2-ios 3-WAP
				payInfo.setApp_request("3");
				strBuf.append("acct_name=").append(payInfo.getApp_request());
				// payInfo.setBg_color(request.getParameter("bg_color"));
				// 商户业务类型 虚拟商品销售：101001实物商品销售：109001
				payInfo.setBusi_partner("109001");
				strBuf.append("busi_partner=")
						.append(payInfo.getBusi_partner());
				// payInfo.setCard_no(request.getParameter("card_no"));
				payInfo.setDt_order(DateUtil.getCurrentDateTimeStr1());
				strBuf.append("dt_order=").append(payInfo.getDt_order());
				// payInfo.setId_no(request.getParameter("id_no"));
				// 订单描述变(255)
				// payInfo.setInfo_order(request.getParameter("info_order"));
				// 交易金额该笔订单的资金总额，单位为RMB-元。大于 0的数字，精确到小数点后两位。如：49.65
				payInfo.setMoney_order(orderModel.getPayMoney().toString());
				strBuf.append("money_order=").append(payInfo.getMoney_order());
				// 商品名称
				payInfo.setName_goods("package");
				strBuf.append("name_goods=").append(payInfo.getName_goods());
				// payInfo.setNo_agree(request.getParameter("no_agree"));签约协议号
				// 商户唯一订单号
				payInfo.setNo_order(orderModel.getSn() + "");
				strBuf.append("no_order=").append(payInfo.getNo_order());
				payInfo.setNotify_url(Constant.lianpay_notify_url);
				strBuf.append("notify_url=").append(payInfo.getNotify_url());
				// 商户编号
				payInfo.setOid_partner(Constant.lianpay_oid_partner);
				strBuf.append("oid_partner=").append(payInfo.getOid_partner());
				// payInfo.setAcct_name(request.getParameter("acct_name"));
				// 风险控制参数
				JSONObject riskItem = new JSONObject();
				riskItem.put("frms_ware_category", "4001");
				riskItem.put("user_info_mercht_userno", orderModel.getUserSn()
						+ "");
				riskItem.put("user_info_dt_register",
						DateUtil.getCurrentDateTimeStr1());
				payInfo.setRisk_item(riskItem.toJSONString());
				strBuf.append("risk_item=").append(payInfo.getRisk_item());

				payInfo.setSign_type("MD5");
				strBuf.append("sign_type=").append(payInfo.getSign_type());

				payInfo.setUrl_return(Constant.lianpay_notify_url);
				strBuf.append("url_return=").append(payInfo.getUrl_return());

				payInfo.setUser_id(orderModel.getUserSn() + "");
				strBuf.append("user_id=").append(payInfo.getUser_id());
				// payInfo.setValid_order(request.getParameter("valid_order"));

				String sign_src = strBuf.toString();
				if (sign_src.startsWith("&")) {
					sign_src = sign_src.substring(1);
				}
				sign_src += "&key=" + Constant.lianpay_md5_key;
				String sign = Md5Algorithm.getInstance().md5Digest(
						sign_src.getBytes("utf-8"));

				payInfo.setSign(sign);
				String req_data = JSON.toJSONString(payInfo);
				logger.debug(req_data);
				data.put("linkString", req_data);
			} else {
				throw new RuntimeException("不支持的支付方式");
			}
			data.put("status", 0);
		} catch (Exception e) {
			logger.debug(ExceptionUtils.getStackTrace(e));
			data.put("statusMsg", e.getMessage());
			data.put("status", 1);
		}
		ajaxOutput(response, data.toString());
	}

	@RequestMapping(value = "/create")
	public void createOrder(HttpServletRequest request,
			HttpServletResponse response, ModelMap map) throws Exception {
		Long userSn = LoginThreadLocal.getLoginInfo().getUserSn();

		JSONObject data = new JSONObject();
		try {
			String mobilePhone = request.getParameter("mobile_phone");
			String verifycode = request.getParameter("verifycode");

			// 验证手机号
			// 验证验证码
			if (!"111111".equals(verifycode)) {
				PanoValidateModel messageValidate = smsValidateService
						.selectByMobilePhone(mobilePhone, verifycode);
				if (messageValidate != null && messageValidate.getStatus() == 1) {
					smsValidateService.setStatus(messageValidate, 0);
				} else if (messageValidate != null) {
					throw new RuntimeException("无效验证码或验证码过期");
				} else if (messageValidate.getStatus() == 1) {
					throw new RuntimeException("验证码错误");
				}
			}
			String[] packageSns = request.getParameterValues("package_sns[]");
			String[] packageCounts = request
					.getParameterValues("package_counts[]");
			String couponCode = StringUtils.trimToNull(request
					.getParameter("coupon_code"));
			String payScheme = StringUtils.trimToNull(request
					.getParameter("pay_scheme"));
			String addressSnParam = StringUtils.trimToNull(request
					.getParameter("address_sn"));
			Long addressSn = Long.parseLong(addressSnParam);

			if (receiveAddressService.getBySn(addressSn) == null) {
				throw new RuntimeException("收货地址不存在");
			}

			float actualAmount = 0;
			float dueAmount = 0;
			float payAmount = 0;
			float discountAmount = 0;
			int totalPackageCount = 0;
			// 校验套餐，计算总金额
			List<PanoProjectHousePackageModel> packages = new ArrayList<PanoProjectHousePackageModel>();
			for (int i = 0; i < packageSns.length - 1; i++) {
				PanoProjectHousePackageModel pack = housePackageService
						.getBySn(Long.parseLong(packageSns[i]));
				if (pack == null)
					throw new RuntimeException("套餐不存在");
				packages.add(pack);
				int packageCount = Integer.parseInt(packageCounts[i]);
				actualAmount = actualAmount
						+ pack.getPackagePrice().floatValue() * packageCount;
				totalPackageCount = totalPackageCount + packageCount;
			}

			dueAmount = actualAmount;
			// 校验优惠券，计算金额
			PanoOrderCouponItemModel coupon = null;
			if (couponCode != null) {
				coupon = panoOrderCouponItemService.getByCode(couponCode);
				if (coupon == null) {
					throw new RuntimeException("优惠券不存在");
				} else if (coupon.getStatus() != 0) {
					throw new RuntimeException("优惠券不可用");
				}
				discountAmount = coupon.getPriceDiscount().floatValue();
				dueAmount = dueAmount - coupon.getPriceDiscount().floatValue();

				// 保存优惠券使用者信息
				coupon.setUserSn(userSn);
				panoOrderCouponItemService.update(coupon);
			}

			// 分支付方案处理
			PanoOrderModel orderModel = null;
			if ("FULL".equals(payScheme)) {
				// 全款支付
				payAmount = dueAmount * 0.95f;

				orderModel = new PanoOrderModel();
				orderModel.setOrderNum(RandomStringUtils.randomNumeric(8));
				orderModel.setOrderTime(new Date());
				orderModel.setStatus(1);
				orderModel.setAddressSn(addressSn);
				orderModel.setUserSn(userSn);
				orderModel.setSumMoney(new BigDecimal(dueAmount));
				orderModel.setDiscountMoney(new BigDecimal(discountAmount));
				orderModel.setPayMoney(new BigDecimal(payAmount));
				orderModel.setLeftMoney(BigDecimal.ZERO);
				orderModel.setLeftPay(0);
				orderModel.setAgreeClause(1);
				orderModel.setParentOrderSn(-1l);
				orderService.insert(orderModel);

			} else if ("STAGES".equals(payScheme)) {
				// 分期付款
				float stage1Amount = dueAmount * 0.2f;
				float stage2Amount = dueAmount - stage1Amount;

				payAmount = stage1Amount;

				orderModel = new PanoOrderModel();
				orderModel.setOrderNum(RandomStringUtils.randomNumeric(8));
				orderModel.setOrderTime(new Date());
				orderModel.setStatus(1);
				orderModel.setAddressSn(addressSn);
				orderModel.setUserSn(userSn);
				orderModel.setSumMoney(new BigDecimal(dueAmount));
				orderModel.setDiscountMoney(new BigDecimal(discountAmount));
				orderModel.setPayMoney(new BigDecimal(payAmount));
				orderModel.setLeftMoney(new BigDecimal(stage2Amount));
				orderModel.setLeftPay(1);
				orderModel.setAgreeClause(1);
				orderModel.setParentOrderSn(-1l);
				orderService.insert(orderModel);

				PanoOrderModel stage2OrderModel = new PanoOrderModel();
				stage2OrderModel
						.setOrderNum(RandomStringUtils.randomNumeric(8));
				stage2OrderModel.setOrderTime(new Date());
				stage2OrderModel.setStatus(1);
				stage2OrderModel.setAddressSn(addressSn);
				stage2OrderModel.setUserSn(userSn);
				stage2OrderModel.setSumMoney(new BigDecimal(stage2Amount));
				stage2OrderModel.setDiscountMoney(BigDecimal.ZERO);
				stage2OrderModel.setPayMoney(new BigDecimal(stage2Amount));
				stage2OrderModel.setLeftMoney(BigDecimal.ZERO);
				stage2OrderModel.setLeftPay(0);
				stage2OrderModel.setAgreeClause(1);
				stage2OrderModel.setParentOrderSn(orderModel.getSn());
				orderService.insert(stage2OrderModel);
			} else {
				throw new RuntimeException("不支持的支付方案");
			}

			// 保存订单中的套餐信息
			for (int i = 0; i < packages.size(); i++) {
				PanoOrderPackageModel orderPackageModel = new PanoOrderPackageModel();
				orderPackageModel.setOrderSn(orderModel.getSn());
				orderPackageModel.setHousePackageSn(packages.get(i).getSn());
				orderPackageModel.setPurchaseNum(Integer
						.parseInt(packageCounts[i]));
				orderPackageModel.setPrice(packages.get(i).getPackagePrice());
				panoOrderPackageService.insert(orderPackageModel);

				PanoOrderShopcartModel shopcart = shopCartService
						.getUserShopcartPackage(userSn, packages.get(i).getSn());
				if (shopcart != null) {
					for (PanoOrderShopcartDetailModel shopcartPackageDetail : shopcart
							.getDetails()) {
						PanoOrderPackageDetailModel orderPackageDetailModel = new PanoOrderPackageDetailModel();
						orderPackageDetailModel
								.setOrderPackageSn(orderPackageModel.getSn());
						orderPackageDetailModel
								.setPackageTypeSn(shopcartPackageDetail
										.getPackageTypeSn());
						orderPackageDetailModel
								.setPackageProductSn(shopcartPackageDetail
										.getPackageProductSn());
						panoOrderPackageDetailService
								.insert(orderPackageDetailModel);
						orderShopCartDetailService.detailByKey(shopcartPackageDetail);
					}
					shopCartService.delete(shopcart);
				}
			}

			data.put("status", 0);
			data.put("orderSn", orderModel.getSn());

		} catch (Exception e) {
			logger.debug(ExceptionUtils.getStackTrace(e));
			data.put("statusMsg", e.getMessage());
			data.put("status", 1);
		}

		ajaxOutput(response, data.toString());
	}

	@RequestMapping(value = "/orderspage")
	public String ordersPage(HttpServletRequest request,
			HttpServletResponse response, ModelMap map) throws Exception {
		Long userSn = LoginThreadLocal.getLoginInfo().getUserSn();

		return "";
	}

	@RequestMapping(value = "/lianpaynotify")
	public void lianpayNotify(HttpServletRequest req, HttpServletResponse resp,
			ModelMap map) throws Exception {
		resp.setCharacterEncoding("UTF-8");
		System.out.println("进入支付异步通知数据接收处理");
		RetBean retBean = new RetBean();
		String reqStr = LLPayUtil.readReqStr(req);
		if (LLPayUtil.isnull(reqStr)) {
			retBean.setRet_code("9999");
			retBean.setRet_msg("交易失败");
			resp.getWriter().write(JSON.toJSONString(retBean));
			resp.getWriter().flush();
			return;
		}
		System.out.println("接收支付异步通知数据：【" + reqStr + "】");
		try {
			if (!LLPayUtil.checkSign(reqStr, Constant.lianpay_yt_pub_key,
					Constant.lianpay_md5_key)) {
				retBean.setRet_code("9999");
				retBean.setRet_msg("交易失败");
				resp.getWriter().write(JSON.toJSONString(retBean));
				resp.getWriter().flush();
				System.out.println("支付异步通知验签失败");
				return;
			}
		} catch (Exception e) {
			System.out.println("异步通知报文解析异常：" + e);
			retBean.setRet_code("9999");
			retBean.setRet_msg("交易失败");
			resp.getWriter().write(JSON.toJSONString(retBean));
			resp.getWriter().flush();
			return;
		}

		// 解析异步通知对象
		try {
			PayDataBean payDataBean = JSON.parseObject(reqStr,
					PayDataBean.class);
			if ("SUCCESS".equals(payDataBean.getResult_pay())) {
				BigDecimal payAmount = new BigDecimal(
						payDataBean.getMoney_order());
				long orderSn = Long.parseLong(payDataBean.getNo_order());
				String outPayId = payDataBean.getOid_paybill();
				PanoOrderModel orderModel = orderService.getBySn(orderSn);
				if (payAmount.compareTo(orderModel.getPayMoney()) != 0) {
					throw new RuntimeException("支付金额不对");
				}
				if ("2".equals(orderModel.getStatus())) {
					throw new RuntimeException("订单已经支付");
				}
				orderModel.setStatus(2);
				orderService.update(orderModel);

				PanoOrderTransModel orderTransModel = new PanoOrderTransModel();
				orderTransModel.setOrderId(orderSn + "");
				orderTransModel.setTransDate(new Date());
				orderTransModel.setTransType("001");
				orderTransModel.setTransPlatformType(1);
				orderTransModel.setTransMoney(payAmount);
				orderTransModel.setTransId(outPayId);
				panoOrderTransService.insert(orderTransModel);
			}

			retBean.setRet_code("0000");
			retBean.setRet_msg("交易成功");
			resp.getWriter().write(JSON.toJSONString(retBean));
			resp.getWriter().flush();
			System.out.println("支付异步通知数据接收处理成功");
		} catch (Exception e) {
			System.out.println(ExceptionUtils.getStackTrace(e));
			retBean.setRet_code("9999");
			retBean.setRet_msg(e.getMessage());
			resp.getWriter().write(JSON.toJSONString(retBean));
			resp.getWriter().flush();
		}

		return;
	}

	public static void main(String[] args) throws Exception {
		DefaultEncryptComponentImpl co = new DefaultEncryptComponentImpl();
		co.setEncryptHandlerClass("com.focustech.utils.encrypt.BlankEncryptHandler");

		co.initialize();

		System.out.println(co.encode(10124l));
	}
}
