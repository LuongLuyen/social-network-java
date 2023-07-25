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
}
