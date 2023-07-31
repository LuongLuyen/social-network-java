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
			user.setUserName(resultSet.getString("username"));
			user.setPassword(resultSet.getString("password"));
			user.setFullName(resultSet.getString("full_name"));
			user.setEmail(resultSet.getString("email"));
			user.setStudyAt(resultSet.getString("study_at"));
			user.setWorkingAt(resultSet.getString("working_at"));
			user.setDateOfbirth(resultSet.getString("date_of_birth"));
			user.setAvatarUrl(resultSet.getString("avatar_url"));
			
			return user;
		} catch (SQLException e) {
			return null;
		}
	}

}
