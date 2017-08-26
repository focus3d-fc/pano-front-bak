package com.focus3d.pano.order.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.focus3d.pano.common.dao.CommonDao;
import com.focus3d.pano.common.service.impl.CommonServiceImpl;
import com.focus3d.pano.model.PanoOrderModel;
import com.focus3d.pano.model.PanoOrderPackageModel;
import com.focus3d.pano.model.PanoProjectHousePackageModel;
import com.focus3d.pano.order.dao.PanoOrderDao;
import com.focus3d.pano.order.dao.PanoOrderPackageDao;
import com.focus3d.pano.order.service.PanoOrderService;
import com.focus3d.pano.project.dao.PanoProjectHousePackageDao;

/**
 * 
 * *
 * 
 * @author lihaijun
 * 
 */
@Service
@Transactional
public class PanoOrderServiceImpl extends CommonServiceImpl<PanoOrderModel>
		implements PanoOrderService<PanoOrderModel> {
	@Autowired
	private PanoOrderDao orderDao;
	@Autowired
	private PanoOrderPackageDao orderPackageDap;
	@Autowired
	private PanoProjectHousePackageDao projectHousePackageDao;

	@Override
	public CommonDao<PanoOrderModel> getDao() {
		return orderDao;
	}

	@Override
	public List<PanoOrderModel> getUserOrders(Long userSn, Integer status)
			throws SQLException {
		List<PanoOrderModel> orders = orderDao.myOrders(userSn, status);
		for (PanoOrderModel order : orders) {
			List<PanoOrderPackageModel> orderPackages = orderPackageDap
					.list(order.getSn());
			order.setOrderPackageModels(orderPackages);
		}
		return orders;
	}
}
