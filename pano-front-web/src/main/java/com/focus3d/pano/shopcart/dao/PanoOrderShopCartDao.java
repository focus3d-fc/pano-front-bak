package com.focus3d.pano.shopcart.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.focus3d.pano.common.dao.CommonDao;
import com.focus3d.pano.model.PanoOrderShopcartModel;
import com.focus3d.pano.model.ibator.PanoOrderShopcartCriteria;
/**
 * 
 * *
 * @author lihaijun
 *
 */
@Repository
public class PanoOrderShopCartDao extends CommonDao<PanoOrderShopcartModel> {
	/**
	 * 
	 * *
	 * @param userSn
	 * @return
	 */
	public List<PanoOrderShopcartModel> listByUser(long userSn) {
		PanoOrderShopcartCriteria criteria = new PanoOrderShopcartCriteria();
		criteria.createCriteria().andUserSnEqualTo(userSn);
		return selectByCriteria(criteria, PanoOrderShopcartModel.class);
		
	}

}
