package com.socialnetwork.service;

import com.socialnetwork.model.UserModel;

public interface IUserService {
	UserModel findOne(Long id);
	UserModel findUser(String userName);
	UserModel create(UserModel userModel);
}
