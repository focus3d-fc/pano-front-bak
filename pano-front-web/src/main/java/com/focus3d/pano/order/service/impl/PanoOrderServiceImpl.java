package com.focus3d.pano.order.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.focus3d.pano.common.dao.CommonDao;
import com.focus3d.pano.common.service.impl.CommonServiceImpl;
import com.focus3d.pano.member.service.PanoUserReceiveAddressService;
import com.focus3d.pano.model.PanoOrderCouponItemModel;
import com.focus3d.pano.model.PanoOrderModel;
import com.focus3d.pano.model.PanoOrderPackageDetailModel;
import com.focus3d.pano.model.PanoOrderPackageModel;
import com.focus3d.pano.model.PanoProductModel;
import com.focus3d.pano.model.PanoProjectHousePackageModel;
import com.focus3d.pano.model.PanoProjectPackageTypeModel;
import com.focus3d.pano.model.PanoUserReceiveAddressModel;
import com.focus3d.pano.order.dao.PanoOrderCouponItemDao;
import com.focus3d.pano.order.dao.PanoOrderDao;
import com.focus3d.pano.order.dao.PanoOrderPackageDao;
import com.focus3d.pano.order.dao.PanoOrderPackageDetailDao;
import com.focus3d.pano.order.service.PanoOrderService;
import com.focus3d.pano.product.dao.PanoProductDao;
import com.focus3d.pano.project.dao.PanoProjectHousePackageDao;
import com.focus3d.pano.project.dao.PanoProjectPackageTypeDao;
import com.focus3d.pano.project.service.PanoProjectHousePackageService;

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
	private PanoOrderPackageDetailDao orderPackageDetailDao;
	@Autowired
	private PanoProjectHousePackageDao projectHousePackageDao;
	@Autowired
	private PanoProductDao productDao;
	@Autowired
	private PanoProjectPackageTypeDao packageTypeDao;
	@Autowired
	private PanoUserReceiveAddressService<PanoUserReceiveAddressModel> receiveAddressService;
	@Autowired
	private PanoProjectHousePackageService<PanoProjectHousePackageModel> housePackageService;
	@Autowired
	private PanoOrderCouponItemDao panoOrderCouponItemDao;

	@Override
	public CommonDao<PanoOrderModel> getDao() {
		return orderDao;
	}

	@Override
	public PanoOrderModel getSonOrder(Long orderSn) throws SQLException {
		return orderDao.getSonOrder(orderSn);
	}

	@Override
	public List<PanoOrderModel> getUserOrders(Long userSn, Integer status)
			throws SQLException {
		List<PanoOrderModel> orders = orderDao.myOrders(userSn, status);
		List<PanoOrderModel> ordersDeal = new ArrayList<PanoOrderModel>();
		for (PanoOrderModel order : orders) {
			// List<PanoOrderPackageModel> orderPackages = orderPackageDap
			// .list(order.getSn());
			// order.setOrderPackageModels(orderPackages);

			ordersDeal.add(getOrderDetail(order.getSn()));
		}
		return ordersDeal;
	}

	@Override
	public PanoOrderModel getOrderDetail(Long orderSn) throws SQLException {
		PanoOrderModel order = orderDao.getBySn(orderSn);
		order.setSonOrder(orderDao.getSonOrder(orderSn));
		List<PanoOrderPackageModel> orderPackages = orderPackageDap.list(order
				.getSn());
		order.setAddress(receiveAddressService.getBySn(order.getAddressSn()));
		order.setCouponItem(panoOrderCouponItemDao.getByOrderSn(order.getSn()));
		for (PanoOrderPackageModel orderPackage : orderPackages) {
			List<PanoOrderPackageDetailModel> orderPackageDetails = orderPackageDetailDao
					.listByOrderPackage(orderPackage.getSn());
			for (PanoOrderPackageDetailModel orderPackageDetail : orderPackageDetails) {
				Long packageProductSn = orderPackageDetail
						.getPackageProductSn();
				if (packageProductSn != null) {
					PanoProductModel packageProduct = productDao
							.getBySn(packageProductSn);
					if (packageProduct != null) {
						orderPackageDetail.setPackageProduct(packageProduct);
					}
				}
				Long packageTypeSn = orderPackageDetail.getPackageTypeSn();
				if (packageTypeSn != null) {
					PanoProjectPackageTypeModel packageType = packageTypeDao
							.getBySn(packageTypeSn);
					if (packageType != null) {
						orderPackageDetail.setPackageType(packageType);
					}
				}
			}

			PanoProjectHousePackageModel housePackage = housePackageService
					.getDetail(orderPackage.getHousePackageSn());
			orderPackage.setHousePackageModel(housePackage);

			orderPackage.setOrderPackageDetails(orderPackageDetails);
		}
		order.setOrderPackageModels(orderPackages);
		return order;
	}
}
