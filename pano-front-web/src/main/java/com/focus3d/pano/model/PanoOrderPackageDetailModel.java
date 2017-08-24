package com.focus3d.pano.model;

import com.focus3d.pano.common.model.CommonModel;
import com.focus3d.pano.model.ibator.PanoOrderPackageDetail;
import com.focus3d.pano.model.ibator.PanoOrderPackageDetailCriteria;
/**
 * 
 * *
 * @author lihaijun
 *
 */
public class PanoOrderPackageDetailModel extends PanoOrderPackageDetail<PanoOrderPackageDetailModel, PanoOrderPackageDetailCriteria> implements CommonModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private PanoProductModel packageProduct;
	
	private PanoProjectPackageTypeModel packageType;

	public PanoProductModel getPackageProduct() {
		return packageProduct;
	}

	public void setPackageProduct(PanoProductModel packageProduct) {
		this.packageProduct = packageProduct;
	}

	public PanoProjectPackageTypeModel getPackageType() {
		return packageType;
	}

	public void setPackageType(PanoProjectPackageTypeModel packageType) {
		this.packageType = packageType;
	}
	
}
