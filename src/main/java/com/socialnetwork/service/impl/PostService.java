package com.socialnetwork.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.socialnetwork.dao.IPostDAO;
import com.socialnetwork.model.PostModel;
import com.socialnetwork.service.IPostService;

public class PostService implements IPostService {
	@Inject
	private IPostDAO postDAO;
	@Override
	public List<PostModel>  findAll() {
		return postDAO.findAll();
	}
	@Override
	public PostModel create(PostModel postModel) {
		postDAO.create(postModel);
		return null;
	}
}
