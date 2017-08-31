package com.focus3d.pano.order;

public class Constant {
	//项目域名
	public static String DOMAIN = "app-wx.3d-focus.com";
	//public static String DOMAIN = "gwzj.joy-homeplus.com";
	//连连认证支付参数
	//商户号
	public static String LIANPAY_OID_PARTNER = "201708290000844702";
	//接收异步通知地址
	public static String LIANPAY_NOTIFY_URL = "http://"+DOMAIN+"/order/lianpaynotify"; 
	//支付结束后返回地址
	public static String LIANPAY_RETURN_URL = "http://"+DOMAIN+"/order/lianpayreturn";
	//MD5 KEY
	public static String LIANPAY_MD5_KEY = "dfs34324dsjflkj0090i09803osdflj0949h";
	//连连公钥
	public static String LIANPAY_YT_PUB_KEY = "http://www.3d-focus.com";
	//商户私钥
	public static String LIANPAY_OID_PRI_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCSS/DiwdCf/aZsxxcacDnooGph3d2JOj5GXWi+q3gznZauZjkNP8SKl3J2liP0O6rU/Y/29+IUe+GTMhMOFJuZm1htAtKiu5ekW0GlBMWxf4FPkYlQkPE0FtaoMP3gYfh+OwI+fIRrpW3ySn3mScnc6Z700nU/VYrRkfcSCbSnRwIDAQAB";
	//请求接口
	public static String LIANPAY_AUTH_PAY_URL = "https://wap.lianlianpay.com/authpay.htm";
	//业务类型，连连支付根据商户业务为商户开设的业务类型； （101001：虚拟商品销售、109001：实物商品销售、108001：外部账户充值）
	public static String LIANPAY_AUTH_PAY_BUSI_PARTNER = "101001";
	//微信参数
	//公众号APP ID
	public static String wx_official_appid = "wxed31115f33aab720";
	//公众号appsecret
	public static String wx_official_appsecret = "4bfa05cab2a336a89c48167589717366";
	//微信商户号
	public static String wx_official_mchid = "1486464992";
	//微信商户KEY
	public static String wx_official_mchkey = "34dfgy57644534fdhkolu797dgdsghut";
	//支付异步通知
	public static String wx_officialpay_notifyurl = "http://"+DOMAIN+"/order/wxpaynotify";
	//支付同步通知
	public static String wx_officialpay_returnurl = "http://"+DOMAIN+"/order/orderspage";

}
