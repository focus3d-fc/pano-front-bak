package com.focus3d.pano.order.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.focus3d.pano.common.dao.CommonDao;
import com.focus3d.pano.model.PanoOrderModel;
import com.focus3d.pano.model.PanoOrderPackageModel;
import com.focus3d.pano.model.ibator.PanoOrderCriteria;
import com.focus3d.pano.model.ibator.PanoOrderPackageCriteria;

/**
 * 
 * *
 * 
 * @author lihaijun
 * 
 */
@Repository
public class PanoOrderDao extends CommonDao<PanoOrderModel> {

	public PanoOrderModel getSonOrder(Long orderSn) {
		PanoOrderCriteria criteria = new PanoOrderCriteria();
		criteria.createCriteria().andParentOrderSnEqualTo(orderSn);
		return selectFirstByExample(criteria, PanoOrderModel.class);
	}

	public List<PanoOrderModel> myOrders(Long userSn, Integer status)
			throws SQLException {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userSn", userSn);
		if (status == null)
			return (List) getSqlMapClient().queryForList(
					"c_pano_order.selectAllOrders", map);
		else if (status == 2)
			return (List) getSqlMapClient().queryForList(
					"c_pano_order.selectPayedOrders", map);
		else if (status == 1)
			return (List) getSqlMapClient().queryForList(
					"c_pano_order.selectUnpayedOrders", map);
		return (List) getSqlMapClient().queryForList(
				"c_pano_order.selectAllOrders", map);
	}

	/**
	 * 
	 * *
	 * 
	 * @param actSn
	 * @return
	 */
	public List<PanoOrderModel> listByAct(long actSn) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("actSn", actSn);
		try {
			return (List) getSqlMapClient().queryForList(
					"c_pano_act_gift_user.selectPayedOrders", map);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
