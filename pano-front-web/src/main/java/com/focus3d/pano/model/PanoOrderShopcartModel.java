package com.focus3d.pano.model;

import java.util.ArrayList;
import java.util.List;

import com.focus3d.pano.common.model.CommonModel;
import com.focus3d.pano.model.ibator.PanoOrderShopcart;
import com.focus3d.pano.model.ibator.PanoOrderShopcartCriteria;
/**
 * 
 * *
 * @author lihaijun
 *
 */
public class PanoOrderShopcartModel extends PanoOrderShopcart<PanoOrderShopcartModel, PanoOrderShopcartCriteria> implements CommonModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private PanoProjectHousePackageModel housePackage;
	
	private List<PanoOrderPackageDetailModel> housePackageDetails = new ArrayList<PanoOrderPackageDetailModel>();

	public PanoProjectHousePackageModel getHousePackage() {
		return housePackage;
	}

	public void setHousePackage(PanoProjectHousePackageModel housePackage) {
		this.housePackage = housePackage;
	}

	public List<PanoOrderPackageDetailModel> getHousePackageDetails() {
		return housePackageDetails;
	}

	public void setHousePackageDetails(
			List<PanoOrderPackageDetailModel> housePackageDetails) {
		this.housePackageDetails = housePackageDetails;
	}

	

}
