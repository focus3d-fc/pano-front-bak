package com.focus3d.pano.shopcart.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.focus3d.pano.common.dao.CommonDao;
import com.focus3d.pano.model.PanoOrderShopcartModel;
import com.focus3d.pano.model.ibator.PanoOrderShopcartCriteria;

/**
 * 
 * *
 * 
 * @author lihaijun
 * 
 */
@Repository
public class PanoOrderShopCartDao extends CommonDao<PanoOrderShopcartModel> {
	/**
	 * 获取用户购物车套餐 *
	 * 
	 * @param userSn
	 *            用户sn
	 * @return
	 */
	public PanoOrderShopcartModel getUserShopcartPackage(long userSn,
			long housePackageSn) {
		PanoOrderShopcartCriteria criteria = new PanoOrderShopcartCriteria();
		criteria.createCriteria().andUserSnEqualTo(userSn);
		criteria.createCriteria().andHousePackageSnEqualTo(housePackageSn);
		return selectFirstByExample(criteria, PanoOrderShopcartModel.class);
	}

	/**
	 * 获取用户购物车列表 *
	 * 
	 * @param userSn
	 *            用户sn
	 * @return
	 */
	public List<PanoOrderShopcartModel> listByUser(long userSn) {
		PanoOrderShopcartCriteria criteria = new PanoOrderShopcartCriteria();
		criteria.createCriteria().andUserSnEqualTo(userSn);
		return selectByCriteria(criteria, PanoOrderShopcartModel.class);
	}

	/**
	 * 获取购物车套餐信息 *
	 * 
	 * @param housePackageSn
	 *            户型套餐sn
	 * @return
	 */
	public PanoOrderShopcartModel getByHousePackage(long housePackageSn) {
		PanoOrderShopcartCriteria criteria = new PanoOrderShopcartCriteria();
		criteria.createCriteria().andHousePackageSnEqualTo(housePackageSn);
		return selectFirstByExample(criteria, PanoOrderShopcartModel.class);
	}
}
