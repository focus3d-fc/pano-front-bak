package com.focus3d.pano.order;

public class Constant {
	//项目域名
	//public static String domain = "app-wx.3d-focus.com";
	public static String domain = "gwzj.joy-homeplus.com";
	//连连认证支付参数
	//商户号
	public static String lianpay_oid_partner = "201708250000836329";
	//支付异步通知
	public static String lianpay_notify_url = "http://"+domain+"/order/lianpaynotify"; 
	//支付同步通知
	public static String lianpay_return_url = "http://"+domain+"/order/lianpayreturn";
	//MD5 KEY
	public static String lianpay_md5_key = "aldoeirutyghvnfjeurifkdjfhansjds";
	//连连公钥
	public static String lianpay_yt_pub_key = "http://www.baidu.com";
	//商户私钥
	public static String lianpay_oid_pri_key = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCSS/DiwdCf/aZsxxcacDnooGph3d2JOj5GXWi+q3gznZauZjkNP8SKl3J2liP0O6rU/Y/29+IUe+GTMhMOFJuZm1htAtKiu5ekW0GlBMWxf4FPkYlQkPE0FtaoMP3gYfh+OwI+fIRrpW3ySn3mScnc6Z700nU/VYrRkfcSCbSnRwIDAQAB";
	
	
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
	public static String wx_officialpay_notifyurl = "http://"+domain+"/order/wxpaynotify";
	//支付同步通知
	public static String wx_officialpay_returnurl = "http://"+domain+"/order/orderspage";

}
