package com.socialnetwork.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.socialnetwork.dao.IPostDAO;
import com.socialnetwork.model.PostModel;

public class PostDAO implements IPostDAO{
	
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/social_network";
			String user = "root";
			String password = "";
			return DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			return null;
		}
	}

	@Override
	public List<PostModel> findAll() {
		List<PostModel> results = new ArrayList<>();
		String sql = "SELECT * FROM posts";
		Connection connection = getConnection();
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		if(connection != null) {
			try {
				statement = connection.prepareStatement(sql);
				resultSet = statement.executeQuery();
				while (resultSet.next()) {
					PostModel post = new PostModel();
					post.setId(resultSet.getLong("id"));
					post.setUserId(resultSet.getLong("user_id"));
					post.setContent(resultSet.getString("content"));
					post.setLikeCount(resultSet.getLong("like_count"));
					results.add(post);
					}
				return results;
			} catch (SQLException e) {
				return null;
			} finally {
				try {
					if (connection != null) {
						connection.close();
					}
					if (statement != null) {
						statement.close();
					}
					if (resultSet != null) {
						resultSet.close();
					}
				} catch (SQLException e) {
					return null;
				}
			}
		}
		return null;
	}
}
