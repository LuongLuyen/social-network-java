package com.socialnetwork.service;

import com.socialnetwork.model.UserModel;

public interface IUserService {
	UserModel findOne(Long id);
}
