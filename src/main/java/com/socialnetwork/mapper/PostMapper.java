package com.socialnetwork.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.socialnetwork.model.PostModel;

public class PostMapper implements RowMapper<PostModel> {
	@Override
	public PostModel mapRow(ResultSet resultSet) {
		try {
			PostModel post = new PostModel();
			post.setId(resultSet.getLong("id"));
			post.setUserId(resultSet.getLong("user_id"));
			post.setContent(resultSet.getString("content"));
			post.setLikeCount(resultSet.getLong("like_count"));
			return post;
		} catch (SQLException e) {
			return null;
		}
	}

}
