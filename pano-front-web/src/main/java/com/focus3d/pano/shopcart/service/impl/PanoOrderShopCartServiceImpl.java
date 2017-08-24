package com.focus3d.pano.shopcart.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.focus3d.pano.common.dao.CommonDao;
import com.focus3d.pano.common.service.impl.CommonServiceImpl;
import com.focus3d.pano.model.PanoOrderPackageDetailModel;
import com.focus3d.pano.model.PanoOrderShopcartModel;
import com.focus3d.pano.model.PanoProjectHousePackageModel;
import com.focus3d.pano.project.dao.PanoProjectHousePackageDao;
import com.focus3d.pano.shopcart.dao.PanoOrderShopCartDao;
import com.focus3d.pano.shopcart.dao.PanoOrderPackageDetailDao;
import com.focus3d.pano.shopcart.service.PanoOrderShopCartService;
/**
 * 
 * *
 * @author lihaijun
 *
 */
@Service
@Transactional
public class PanoOrderShopCartServiceImpl extends CommonServiceImpl<PanoOrderShopcartModel> implements PanoOrderShopCartService<PanoOrderShopcartModel> {
	@Autowired
	private PanoOrderShopCartDao orderShopCartDao;
	@Autowired
	private PanoOrderPackageDetailDao orderPackageDetailDao;
	@Autowired
	private PanoProjectHousePackageDao housePackageDao;
	
	@Override
	public CommonDao<PanoOrderShopcartModel> getDao() {
		return orderShopCartDao;
	}

	@Override
	public List<PanoOrderShopcartModel> listByUser(long userSn) {
		List<PanoOrderShopcartModel> shopcarts = orderShopCartDao.listByUser(userSn);
		for (PanoOrderShopcartModel shopcart : shopcarts) {
			Long housePackageSn = shopcart.getHousePackageSn();
			PanoProjectHousePackageModel housePackage = housePackageDao.getBySn(housePackageSn);
			if(housePackage != null){
				shopcart.setHousePackage(housePackage);
				List<PanoOrderPackageDetailModel> housePackageDetails = orderPackageDetailDao.listByHousePackage(housePackageSn);
				for (PanoOrderPackageDetailModel panoOrderPackageDetailModel : housePackageDetails) {
					Long packageProductSn = panoOrderPackageDetailModel.getPackageProductSn();
					Long packageTypeSn = panoOrderPackageDetailModel.getPackageTypeSn();
				}
				shopcart.setHousePackageDetails(housePackageDetails);
			}
		}
		return null;
	}

}
