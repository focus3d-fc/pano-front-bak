package com.focus3d.pano.order.service.impl;

import java.sql.SQLException;
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
public class PanoOrderServiceImpl extends CommonServiceImpl<PanoOrderModel> implements PanoOrderService<PanoOrderModel> {
	@Autowired
	private PanoOrderDao orderDao;
	@Autowired
	private PanoOrderPackageDao orderPackageDao;
	@Autowired
	private PanoOrderPackageDetailDao orderPackageDetailDao;
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
	public PanoOrderModel getChildrenOder(Long orderSn) throws SQLException {
		return orderDao.getChildrenOrder(orderSn);
	}
	@Override
	public PanoOrderModel getOrderByNum(String orderNum) throws SQLException {
		return orderDao.getOrderByNum(orderNum);
	}

	@Override
	public List<PanoOrderModel> listByUser(Long userSn, Integer status) throws SQLException {
		List<PanoOrderModel> orders = orderDao.listByUser(userSn, status);
		for (PanoOrderModel order : orders) {
			setOrderDetail(order);
		}
		return orders;
	}

	@Override
	public PanoOrderModel getOrderDetail(Long orderSn) throws SQLException {
		PanoOrderModel order = orderDao.getBySn(orderSn);
		return setOrderDetail(order);
	}

	@Override
	public PanoOrderModel setOrderDetail(PanoOrderModel order) {
		PanoUserReceiveAddressModel address = receiveAddressService.getBySn(order.getAddressSn());
		PanoOrderCouponItemModel coupon = panoOrderCouponItemDao.getByOrderSn(order.getSn());
		order.setAddress(address);
		order.setCouponItem(coupon);
		List<PanoOrderPackageModel> orderPackages = orderPackageDao.listByOrder(order.getSn());
		for (PanoOrderPackageModel orderPackage : orderPackages) {
			//订单套餐明细信息
			List<PanoOrderPackageDetailModel> orderPackageDetails = orderPackageDetailDao.listByOrderPackage(orderPackage.getSn());
			for (PanoOrderPackageDetailModel orderPackageDetail : orderPackageDetails) {
				Long productSn = orderPackageDetail.getPackageProductSn();
				Long packageTypeSn = orderPackageDetail.getPackageTypeSn();
				if (productSn != null && packageTypeSn != null) {
					PanoProductModel packageProduct = productDao.getBySn(productSn);
					if (packageProduct != null) {
						orderPackageDetail.setPackageProduct(packageProduct);
					}
					PanoProjectPackageTypeModel packageType = packageTypeDao.getBySn(packageTypeSn);
					if (packageType != null) {
						orderPackageDetail.setPackageType(packageType);
					}
				}
			}
			orderPackage.setDetails(orderPackageDetails);
			
			PanoProjectHousePackageModel housePackage = housePackageService.getDetail(orderPackage.getHousePackageSn());
			orderPackage.setHousePackage(housePackage);
			order.getOrderPackages().add(orderPackage);
		}
		return order;
	}
}
