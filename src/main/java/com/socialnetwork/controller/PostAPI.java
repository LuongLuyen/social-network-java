package com.socialnetwork.controller;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.socialnetwork.service.IPostService;

@WebServlet(urlPatterns = {"/api-post"})
public class PostAPI extends HttpServlet {


	private static final long serialVersionUID = -6922552214992789789L;
	@Inject
	private IPostService postService;


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		String data = postService.findAll();
		mapper.writeValue(response.getOutputStream(), data);

	}
}
