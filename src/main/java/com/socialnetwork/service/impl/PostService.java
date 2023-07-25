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
	public List<PostModel> findAll() {
		return postDAO.findAll();
	}

	@Override
	public PostModel create(PostModel postModel) {
		Long id = postDAO.create(postModel);
		return postDAO.findOne(id);
	}

	@Override
	public PostModel findOne(Long id) {
		PostModel postModel = postDAO.findOne(id);
		return postModel;
	}
}
