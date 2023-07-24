package com.socialnetwork.dao;

import java.util.List;

import com.socialnetwork.model.PostModel;

public interface IPostDAO {
	List<PostModel> findAll();
}
