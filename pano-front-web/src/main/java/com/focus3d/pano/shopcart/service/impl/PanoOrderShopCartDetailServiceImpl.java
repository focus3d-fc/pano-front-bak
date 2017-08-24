package com.focus3d.pano.shopcart.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.focus3d.pano.common.dao.CommonDao;
import com.focus3d.pano.common.service.impl.CommonServiceImpl;
import com.focus3d.pano.model.PanoOrderShopcartDetailModel;
import com.focus3d.pano.shopcart.dao.PanoOrderShopCartDetailDao;
import com.focus3d.pano.shopcart.service.PanoOrderShopCartDetailService;
/**
 * 
 * *
 * @author lihaijun
 *
 */
@Service
@Transactional
public class PanoOrderShopCartDetailServiceImpl extends CommonServiceImpl<PanoOrderShopcartDetailModel> implements PanoOrderShopCartDetailService<PanoOrderShopcartDetailModel> {
	@Autowired
	private PanoOrderShopCartDetailDao orderShopCartDetailDao;
	@Override
	public CommonDao<PanoOrderShopcartDetailModel> getDao() {
		return orderShopCartDetailDao;
	}

}
