package com.focus3d.pano.shopcart.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.focus3d.pano.common.dao.CommonDao;
import com.focus3d.pano.common.service.impl.CommonServiceImpl;
import com.focus3d.pano.filter.LoginThreadLocal;
import com.focus3d.pano.model.PanoOrderPackageDetailModel;
import com.focus3d.pano.model.PanoOrderShopcartModel;
import com.focus3d.pano.model.PanoProductModel;
import com.focus3d.pano.model.PanoProjectHousePackageModel;
import com.focus3d.pano.model.PanoProjectPackageTypeModel;
import com.focus3d.pano.order.dao.PanoOrderPackageDetailDao;
import com.focus3d.pano.product.dao.PanoProductDao;
import com.focus3d.pano.project.dao.PanoProjectHousePackageDao;
import com.focus3d.pano.project.dao.PanoProjectPackageTypeDao;
import com.focus3d.pano.shopcart.dao.PanoOrderShopCartDao;
import com.focus3d.pano.shopcart.service.PanoOrderShopCartService;
import com.focustech.common.utils.EncryptUtil;
import com.focustech.common.utils.ListUtils;
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
	@Autowired
	private PanoProductDao productDao;
	@Autowired
	private PanoProjectPackageTypeDao packageTypeDao;
	
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
				for (PanoOrderPackageDetailModel orderPackageDetail : housePackageDetails) {
					Long packageProductSn = orderPackageDetail.getPackageProductSn();
					if(packageProductSn != null){
						PanoProductModel packageProduct = productDao.getBySn(packageProductSn);
						if(packageProduct != null){
							orderPackageDetail.setPackageProduct(packageProduct);
						}
					}
					Long packageTypeSn = orderPackageDetail.getPackageTypeSn();
					if(packageTypeSn != null){
						PanoProjectPackageTypeModel packageType = packageTypeDao.getBySn(packageTypeSn);
						if(packageType != null){
							orderPackageDetail.setPackageType(packageType);
						}
					}
				}
				shopcart.setHousePackageDetails(housePackageDetails);
			}
		}
		return shopcarts;
	}

	@Override
	public void add(long housePackageSn) {
		Long userSn = LoginThreadLocal.getLoginInfo().getUserSn();
		List<PanoProjectPackageTypeModel> housePackageTypeList = packageTypeDao.listByHousePackage(housePackageSn);
		PanoOrderShopcartModel shopcartModel = new PanoOrderShopcartModel();
		shopcartModel.setUserSn(userSn);
		shopcartModel.setHousePackageSn(housePackageSn);
		int housePackageNum = 0;
		//套餐类别
		List<PanoOrderPackageDetailModel> orderPackageDetails = new ArrayList<PanoOrderPackageDetailModel>();
		for (PanoProjectPackageTypeModel housePackageType : housePackageTypeList) {
			//取类别下第一条产品
			List<PanoProductModel> products = housePackageType.getProducts();
			if(ListUtils.isNotEmpty(products)){
				housePackageNum ++;
				PanoProductModel product = products.get(0);
				PanoOrderPackageDetailModel orderPackageDetailModel = new PanoOrderPackageDetailModel();
				orderPackageDetailModel.setPackageProductSn(product.getSn());
				orderPackageDetailModel.setPackageTypeSn(housePackageType.getSn());
				orderPackageDetailModel.setHousePackageSn(housePackageSn);
				orderPackageDetails.add(orderPackageDetailModel);
			}
		}
		shopcartModel.setPackageTypeNum(housePackageNum);
		orderShopCartDao.insert(shopcartModel);
		for(PanoOrderPackageDetailModel orderPackageDetail : orderPackageDetails){
			orderPackageDetailDao.insert(orderPackageDetail);
		}
	}

}
