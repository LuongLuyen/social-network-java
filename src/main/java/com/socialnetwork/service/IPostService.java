package com.socialnetwork.service;

import java.util.List;

import com.socialnetwork.model.PostModel;

public interface IPostService {
	List<PostModel> findAll();
	PostModel create(PostModel postModel);
	PostModel findOne(Long id);
	PostModel update(PostModel postModel);
}
