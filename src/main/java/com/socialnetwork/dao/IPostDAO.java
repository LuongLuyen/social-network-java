package com.socialnetwork.dao;

import java.util.List;

import com.socialnetwork.model.PostModel;

public interface IPostDAO {
	List<PostModel> findAll();
	Long create(PostModel postModel);
	PostModel findOne(Long id);
	void update(PostModel postModel);
	void delete(long id);
}
