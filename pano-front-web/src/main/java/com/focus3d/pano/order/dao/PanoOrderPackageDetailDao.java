package com.focus3d.pano.order.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.focus3d.pano.common.dao.CommonDao;
import com.focus3d.pano.model.PanoOrderPackageDetailModel;
import com.focus3d.pano.model.ibator.PanoOrderPackageDetailCriteria;
/**
 * 
 * *
 * @author lihaijun
 *
 */
@Repository
public class PanoOrderPackageDetailDao extends CommonDao<PanoOrderPackageDetailModel> {
	/**
	 * 
	 * *
	 * @param housePackageSn
	 * @return
	 */
	public List<PanoOrderPackageDetailModel> listByHousePackage(long housePackageSn){
		PanoOrderPackageDetailCriteria criteria = new PanoOrderPackageDetailCriteria();
		criteria.createCriteria().andHousePackageSnEqualTo(housePackageSn);
		return selectByCriteria(criteria, PanoOrderPackageDetailModel.class);
	}
}
