package com.focus3d.pano.order.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.focus3d.pano.common.dao.CommonDao;
import com.focus3d.pano.common.service.impl.CommonServiceImpl;
import com.focus3d.pano.model.PanoOrderCouponItemModel;
import com.focus3d.pano.order.dao.PanoOrderCouponItemDao;
import com.focus3d.pano.order.service.PanoOrderCouponItemService;
/**
 * 
 * *
 * @author lihaijun
 *
 */
@Service
@Transactional
public class PanoOrderCouponItemServiceImpl extends CommonServiceImpl<PanoOrderCouponItemModel> implements PanoOrderCouponItemService<PanoOrderCouponItemModel> {
	@Autowired
	private PanoOrderCouponItemDao orderCouponItemDao;
	@Override
	public CommonDao<PanoOrderCouponItemModel> getDao() {
		return orderCouponItemDao;
	}

}
