package com.socialnetwork.service.impl;

import javax.inject.Inject;

import com.socialnetwork.dao.IPostDAO;
import com.socialnetwork.service.IPostService;

public class PostService implements IPostService {
	@Inject
	private IPostDAO postDAO;
	@Override
	public String  findAll() {
		return postDAO.findAll();
	}
}
