package com.focus3d.pano.model;

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

}
