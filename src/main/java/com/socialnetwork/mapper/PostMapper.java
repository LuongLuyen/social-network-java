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
			post.setUserId(resultSet.getLong("userId"));
			post.setContent(resultSet.getString("content"));
			post.setContentUrl(resultSet.getString("contentUrl"));
			post.setLikeCount(resultSet.getLong("likeCount"));
			post.setCommentCount(resultSet.getLong("commentCount"));
			post.setShareCount(resultSet.getLong("shareCount"));
			post.setCategory(resultSet.getString("category"));
			return post;
		} catch (SQLException e) {
			return null;
		}
	}

}
