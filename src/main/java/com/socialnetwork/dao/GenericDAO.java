package com.socialnetwork.dao;

import java.util.List;

import com.socialnetwork.mapper.RowMapper;

public interface GenericDAO {
	<T> List<T> query(String sql, RowMapper<T> rowMapper, Object... parameters);
}