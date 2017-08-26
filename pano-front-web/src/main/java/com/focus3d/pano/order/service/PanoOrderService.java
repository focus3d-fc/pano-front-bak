package com.focus3d.pano.order.service;

import java.sql.SQLException;
import java.util.List;

import com.focus3d.pano.common.service.CommonService;
import com.focus3d.pano.model.PanoOrderModel;

/**
 * 订单 *
 * 
 * @author lihaijun
 * 
 * @param <T>
 */
public interface PanoOrderService<T> extends CommonService<T> {
	public List<PanoOrderModel> getUserOrders(Long userSn, Integer status)
			throws SQLException;

	public PanoOrderModel getOrderDetail(Long orderSn) throws SQLException;
}
