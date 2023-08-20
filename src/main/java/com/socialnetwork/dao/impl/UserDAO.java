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

	@Override
	public Long create(UserModel userModel) {
		String sql = "INSERT INTO users (userName,password,fullName,email,role) VALUES (?,?,?,?,?)";
		return insert(
				sql, 
				userModel.getUserName(), 
				userModel.getPassword(),
				userModel.getFullName(),
				userModel.getEmail(),
				userModel.getRole()
	    );
	}

	@Override
	public UserModel findUser(String userName) {
		String sql = "SELECT * FROM users WHERE userName = ?";
		List<UserModel> user = query(sql, new UserMapper(), userName);
		return user.isEmpty() ? null : user.get(0);
	}
}
