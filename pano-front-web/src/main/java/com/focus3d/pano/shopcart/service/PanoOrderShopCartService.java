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

	List<T> listByUser(long userSn);
}
