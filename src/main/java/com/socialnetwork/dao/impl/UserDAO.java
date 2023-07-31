package com.socialnetwork.dao.impl;

import java.util.List;

import com.socialnetwork.dao.IUserDAO;
import com.socialnetwork.mapper.UserMapper;
import com.socialnetwork.model.UserModel;

public class UserDAO extends AbstractDAO implements IUserDAO {

	@Override
	public UserModel findOne(Long id) {
		String sql = "SELECT * FROM users WHERE id = ?";
		List<UserModel> user = query(sql, new UserMapper(), id);
		return user.isEmpty() ? null : user.get(0);
	}
}
