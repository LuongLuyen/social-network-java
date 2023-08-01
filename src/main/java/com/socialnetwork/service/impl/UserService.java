package com.socialnetwork.service.impl;

import javax.inject.Inject;

import com.socialnetwork.dao.IUserDAO;
import com.socialnetwork.model.UserModel;
import com.socialnetwork.service.IUserService;

public class UserService implements IUserService {
	@Inject
	private IUserDAO userDao;

	@Override
	public UserModel findOne(Long id) {
		UserModel userModel = userDao.findOne(id);
		return userModel;
	}

	@Override
	public UserModel create(UserModel userModel) {
		Long id = userDao.create(userModel);
		return userDao.findOne(id);
	}
}
