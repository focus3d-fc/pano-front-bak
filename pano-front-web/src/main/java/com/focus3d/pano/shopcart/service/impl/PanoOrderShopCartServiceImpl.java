package com.focus3d.pano.shopcart.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.focus3d.pano.common.dao.CommonDao;
import com.focus3d.pano.common.service.impl.CommonServiceImpl;
import com.focus3d.pano.model.PanoOrderShopcartModel;
import com.focus3d.pano.shopcart.dao.PanoOrderShopCartDao;
import com.focus3d.pano.shopcart.service.PanoOrderShopCartService;
/**
 * 
 * *
 * @author lihaijun
 *
 */
@Service
@Transactional
public class PanoOrderShopCartServiceImpl extends CommonServiceImpl<PanoOrderShopcartModel> implements PanoOrderShopCartService<PanoOrderShopcartModel> {
	@Autowired
	private PanoOrderShopCartDao orderShopCartDao;
	
	@Override
	public CommonDao<PanoOrderShopcartModel> getDao() {
		return orderShopCartDao;
	}

}
