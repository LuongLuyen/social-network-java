package com.socialnetwork.dao;

import com.socialnetwork.model.UserModel;

public interface IUserDAO {
	UserModel findOne(Long id);
}
