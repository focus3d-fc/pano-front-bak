package com.focus3d.pano.model;

import java.util.List;

import com.focus3d.pano.common.model.CommonModel;
import com.focus3d.pano.model.ibator.PanoOrder;
import com.focus3d.pano.model.ibator.PanoOrderCriteria;

public class PanoOrderModel extends PanoOrder<PanoOrderModel, PanoOrderCriteria> implements CommonModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private  List<PanoOrderPackageModel> orderPackageModels;
}
