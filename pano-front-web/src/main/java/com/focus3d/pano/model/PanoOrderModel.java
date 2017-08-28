package com.focus3d.pano.model;

import java.util.List;

import com.focus3d.pano.common.model.CommonModel;
import com.focus3d.pano.model.ibator.PanoOrder;
import com.focus3d.pano.model.ibator.PanoOrderCriteria;
import com.focustech.cief.ibatis.annotation.Column;

public class PanoOrderModel extends
		PanoOrder<PanoOrderModel, PanoOrderCriteria> implements CommonModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<PanoOrderPackageModel> orderPackageModels;
	private PanoUserReceiveAddressModel address;
	private PanoOrderCouponItemModel couponItem;
	private PanoOrderModel sonOrder;

	public PanoOrderModel getSonOrder() {
		return sonOrder;
	}

	public void setSonOrder(PanoOrderModel sonOrder) {
		this.sonOrder = sonOrder;
	}

	public PanoOrderCouponItemModel getCouponItem() {
		return couponItem;
	}

	public void setCouponItem(PanoOrderCouponItemModel couponItem) {
		this.couponItem = couponItem;
	}

	public List<PanoOrderPackageModel> getOrderPackageModels() {
		return orderPackageModels;
	}

	public void setOrderPackageModels(
			List<PanoOrderPackageModel> orderPackageModels) {
		this.orderPackageModels = orderPackageModels;
	}

	public PanoUserReceiveAddressModel getAddress() {
		return address;
	}

	public void setAddress(PanoUserReceiveAddressModel address) {
		this.address = address;
	}

}
