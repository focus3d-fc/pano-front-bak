package com.focus3d.pano.model;

import com.focus3d.pano.common.model.CommonModel;
import com.focus3d.pano.model.ibator.PanoProjectHousePackage;
import com.focus3d.pano.model.ibator.PanoProjectHousePackageCriteria;
/**
 * 
 * *
 * @author lihaijun
 *
 */
public class PanoProjectHousePackageModel extends PanoProjectHousePackage<PanoProjectHousePackageModel, PanoProjectHousePackageCriteria> implements CommonModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name;
	
	private PanoProjectHouseModel house;
	
	private PanoProjectStyleModel style;

	public PanoProjectHouseModel getHouse() {
		return house;
	}

	public void setHouse(PanoProjectHouseModel house) {
		this.house = house;
	}


	public PanoProjectStyleModel getStyle() {
		return style;
	}

	public void setStyle(PanoProjectStyleModel style) {
		this.style = style;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
