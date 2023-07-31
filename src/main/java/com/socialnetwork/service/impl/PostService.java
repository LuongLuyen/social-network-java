package com.socialnetwork.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.socialnetwork.dao.IPostDAO;
import com.socialnetwork.model.PostModel;
import com.socialnetwork.service.IPostService;

public class PostService implements IPostService {
	@Inject
	private IPostDAO postDao;

	@Override
	public List<PostModel> findAll() {
		return postDao.findAll();
	}

	@Override
	public PostModel create(PostModel postModel) {
		Long id = postDao.create(postModel);
		return postDao.findOne(id);
	}

	@Override
	public PostModel findOne(Long id) {
		PostModel postModel = postDao.findOne(id);
		return postModel;
	}

	@Override
	public PostModel update(PostModel postModel) {
		postDao.update(postModel);
		return postDao.findOne(postModel.getId());
	}

	@Override
	public void delete(long[] ids) {
		for (long id: ids) {
			postDao.delete(id);
		}
	}
}
