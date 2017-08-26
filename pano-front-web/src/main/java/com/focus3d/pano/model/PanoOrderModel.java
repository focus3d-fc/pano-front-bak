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
	@Column
	private Integer isPayed;

	public Integer getIsPayed() {
		return isPayed;
	}

	public void setIsPayed(Integer isPayed) {
		this.isPayed = isPayed;
	}

	public List<PanoOrderPackageModel> getOrderPackageModels() {
		return orderPackageModels;
	}

	public void setOrderPackageModels(
			List<PanoOrderPackageModel> orderPackageModels) {
		this.orderPackageModels = orderPackageModels;
	}

}
