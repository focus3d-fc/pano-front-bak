package com.focus3d.pano.shopcart.service;

import java.util.List;

import com.focus3d.pano.common.service.CommonService;
/**
 * 
 * *
 * @author lihaijun
 *
 * @param <T>
 */
public interface PanoOrderShopCartService<T> extends CommonService<T> {
	/**
	 * 获取用户购物车列表
	 * *
	 * @param userSn
	 * @return
	 */
	List<T> listByUser(long userSn);
	/**
	 * 添加户型套餐到购物车,或者从购物车删除
	 * *
	 * @param housePackageSn 户型套餐sn
	 */
	int addOrDelete(long housePackageSn);
}
