package com.socialnetwork.dao.impl;

import java.util.List;

import com.socialnetwork.dao.IPostDAO;
import com.socialnetwork.mapper.PostMapper;
import com.socialnetwork.model.PostModel;

public class PostDAO extends AbstractDAO implements IPostDAO{
	
	@Override
	public List<PostModel> findAll() {
		String sql = "SELECT * FROM posts";
		return query(sql, new PostMapper());
	}

	@Override
	public Long create(PostModel postModel) {
		String sql = "INSERT INTO posts (user_id,content,like_count) VALUES (?,?,?)";
		return insert(sql, postModel.getUserId(),postModel.getContent(),postModel.getLikeCount());
	}
}
