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
		String sql = "INSERT INTO posts (userId,content,contentUrl,likeCount,commentCount,shareCount,category) VALUES (?,?,?,?,?,?,?)";
		return insert(
				sql, 
				postModel.getUserId(),
				postModel.getContent(),
				postModel.getContentUrl(), 
				postModel.getLikeCount(),
				postModel.getCommentCount(),
				postModel.getShareCount(),
				postModel.getCategory()
	    );
	}

	@Override
	public PostModel findOne(Long id) {
		String sql = "SELECT * FROM posts WHERE id = ?";
		List<PostModel> news = query(sql, new PostMapper(), id);
		return news.isEmpty() ? null : news.get(0);
	}

	@Override
	public void update(PostModel postModel) {
		String sql = "UPDATE posts SET userId = ?, content = ?, contentUrl = ?, likeCount = ?, commentCount = ?, shareCount = ?, category =? WHERE id = ?";
		update(
				sql, 
				postModel.getUserId(),
				postModel.getContent(),
				postModel.getContentUrl(), 
				postModel.getLikeCount(),
				postModel.getCommentCount(),
				postModel.getShareCount(),
				postModel.getCategory(),
				
				postModel.getId()
		);
	}
	@Override
	public void delete(long id) {
		String sql = "DELETE FROM posts WHERE id = ?";
		update(sql, id);
	}
}
