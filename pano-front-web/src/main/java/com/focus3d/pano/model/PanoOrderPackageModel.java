package com.focus3d.pano.model;

import java.util.List;

import com.focus3d.pano.common.model.CommonModel;
import com.focus3d.pano.model.ibator.PanoOrderPackage;
import com.focus3d.pano.model.ibator.PanoOrderPackageCriteria;

/**
 * 
 * *
 * 
 * @author lihaijun
 * 
 */
public class PanoOrderPackageModel extends
		PanoOrderPackage<PanoOrderPackageModel, PanoOrderPackageCriteria>
		implements CommonModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PanoProjectHousePackageModel housePackageModel;
	private List<PanoOrderPackageDetailModel> orderPackageDetails;
	public PanoProjectHousePackageModel getHousePackageModel() {
		return housePackageModel;
	}

	public void setHousePackageModel(
			PanoProjectHousePackageModel housePackageModel) {
		this.housePackageModel = housePackageModel;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<PanoOrderPackageDetailModel> getOrderPackageDetails() {
		return orderPackageDetails;
	}

	public void setOrderPackageDetails(
			List<PanoOrderPackageDetailModel> orderPackageDetails) {
		this.orderPackageDetails = orderPackageDetails;
	}

}
