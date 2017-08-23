package com.focus3d.pano.member.service;

import java.util.List;

import com.focus3d.pano.common.service.CommonService;
/**
 * 
 * *
 * @author lihaijun
 *
 * @param <T>
 */
public interface PanoUserReceiveAddressService<T> extends CommonService<T> {
	/**
	 * *
	 * @param userSn
	 * @return
	 */
	List<T> listByUser(long userSn);
}
