package com.focus3d.pano.order.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.focus3d.pano.common.dao.CommonDao;
import com.focus3d.pano.common.service.impl.CommonServiceImpl;
import com.focus3d.pano.model.PanoOrderModel;
import com.focus3d.pano.order.dao.PanoOrderDao;
import com.focus3d.pano.order.service.PanoOrderService;
/**
 * 
 * *
 * @author lihaijun
 *
 */
@Service
@Transactional
public class PanoOrderServiceImpl extends CommonServiceImpl<PanoOrderModel> implements PanoOrderService<PanoOrderModel> {
	@Autowired
	private PanoOrderDao orderDao;
	@Override
	public CommonDao<PanoOrderModel> getDao() {
		return orderDao;
	}

}
