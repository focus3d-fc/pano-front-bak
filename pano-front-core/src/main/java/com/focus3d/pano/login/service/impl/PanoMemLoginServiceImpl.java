package com.focus3d.pano.login.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.focus3d.pano.common.dao.CommonDao;
import com.focus3d.pano.common.service.impl.CommonServiceImpl;
import com.focus3d.pano.login.constant.LoginTypeEnum;
import com.focus3d.pano.login.dao.PanoMemLoginDao;
import com.focus3d.pano.login.service.PanoMemLoginService;
import com.focus3d.pano.model.PanoMemLoginModel;
import com.focus3d.pano.model.PanoMemUserModel;
import com.focus3d.pano.user.dao.PanoMemUserDao;
/**
 * 
 * *
 * @author lihaijun
 *
 */
@Service
@Transactional
public class PanoMemLoginServiceImpl extends CommonServiceImpl<PanoMemLoginModel> implements PanoMemLoginService<PanoMemLoginModel> {
	@Autowired
	private PanoMemLoginDao memLoginDao;
	@Autowired
	private PanoMemUserDao memUserDao;
	
	@Override
	public CommonDao<PanoMemLoginModel> getDao() {
		return memLoginDao;
	}
	@Override
	public PanoMemLoginModel getByName(String loginName, LoginTypeEnum wx) {
		return memLoginDao.getByLoginName(loginName, wx);
	}

	@Override
	public void insertOrUpdate(PanoMemLoginModel memLoginModel, LoginTypeEnum type) {
		String loginName = memLoginModel.getLoginName();
		PanoMemLoginModel loginModel = memLoginDao.getByLoginName(loginName, type);
		if(loginModel != null){
			Long userSn = loginModel.getUserSn();
			PanoMemUserModel userModel = memUserDao.getBySn(userSn);
			memLoginModel.setUser(userModel);
			memLoginModel.setUserSn(userModel.getSn());
		} else {
			PanoMemUserModel userModel = new PanoMemUserModel();
			memUserDao.insertBySystem(userModel);
			Long userSn = userModel.getSn();
			if(userSn != null){
				memLoginModel.setUserSn(userSn);
				memLoginModel.setPassword("-1");
				memLoginModel.setStatus(1);
				memLoginModel.setType(type.getType());
				memLoginModel.setLoginTimes(1);
				memLoginModel.setLastLoginTime(new Date());
				memLoginDao.insertBySystem(memLoginModel);
				memLoginModel.setUser(userModel);
				memLoginModel.setUserSn(userModel.getSn());
			}
		}
	}

}
