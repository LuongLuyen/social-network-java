package com.socialnetwork.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.socialnetwork.model.UserModel;

public class UserMapper implements RowMapper<UserModel> {
	@Override
	public UserModel mapRow(ResultSet resultSet) {
		try {
			UserModel user = new UserModel();
			user.setId(resultSet.getLong("id"));
			user.setUserName(resultSet.getString("userName"));
			user.setPassword(resultSet.getString("password"));
			user.setFullName(resultSet.getString("fullName"));
			user.setEmail(resultSet.getString("email"));
			user.setRole(resultSet.getString("role"));
			return user;
		} catch (SQLException e) {
			return null;
		}
	}

}
