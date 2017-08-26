package com.focus3d.pano.order.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.focus3d.pano.common.dao.CommonDao;
import com.focus3d.pano.model.PanoOrderModel;
import com.focus3d.pano.model.PanoOrderShopcartDetailModel;
import com.focus3d.pano.model.ibator.PanoOrderCriteria;
import com.focus3d.pano.model.ibator.PanoOrderShopcartDetailCriteria;

/**
 * 
 * *
 * 
 * @author lihaijun
 * 
 */
@Repository
public class PanoOrderDao extends CommonDao<PanoOrderModel> {

	public List<PanoOrderModel> list(Long userSn, Integer status) {
		PanoOrderCriteria criteria = new PanoOrderCriteria();
		criteria.createCriteria().andUserSnEqualTo(userSn)
				.andStatusEqualTo(status);
		List<PanoOrderModel> orders = selectByCriteria(criteria,
				PanoOrderShopcartDetailModel.class);

		
		return orders;
	}
}
