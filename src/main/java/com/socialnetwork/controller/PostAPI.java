package com.socialnetwork.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.socialnetwork.model.PostModel;
import com.socialnetwork.service.IPostService;
import com.socialnetwork.utils.HttpUtil;

@WebServlet(urlPatterns = {"/api-post"})
public class PostAPI extends HttpServlet {


	private static final long serialVersionUID = -6922552214992789789L;
	@Inject
	private IPostService postService;


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		List<PostModel> results = new ArrayList<>();
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		results = postService.findAll();
		mapper.writeValue(response.getOutputStream(), results);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		// json --> model
		PostModel data =  HttpUtil.of(request.getReader()).toModel(PostModel.class);
		data = postService.create(data);
		mapper.writeValue(response.getOutputStream(), data);

	}
}
