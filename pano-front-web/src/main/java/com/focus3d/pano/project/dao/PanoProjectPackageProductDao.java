package com.focus3d.pano.project.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.focus3d.pano.common.dao.CommonDao;
import com.focus3d.pano.model.PanoProjectPackageProductModel;
import com.focus3d.pano.model.ibator.PanoProjectPackageProductCriteria;
/**
 * 
 * *
 * @author lihaijun
 *
 */
@Repository
public class PanoProjectPackageProductDao extends CommonDao<PanoProjectPackageProductModel> {
	/**
	 * 
	 * *
	 * @param housePackageTypeSn
	 * @return
	 */
	public List<PanoProjectPackageProductModel> listByPackageType(long housePackageTypeSn){
		PanoProjectPackageProductCriteria criteria = new PanoProjectPackageProductCriteria();
		criteria.createCriteria().andPackageTypeSnEqualTo(housePackageTypeSn);
		return selectByCriteria(criteria, PanoProjectPackageProductModel.class);
	}
}
