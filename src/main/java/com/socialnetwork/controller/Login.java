package com.socialnetwork.controller;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.socialnetwork.model.UserModel;
import com.socialnetwork.service.IUserService;
import com.socialnetwork.utils.HttpUtil;

@WebServlet(urlPatterns = { "/login" })
public class Login extends HttpServlet {

	private static final long serialVersionUID = -6922552214992789789L;
	@Inject
	private IUserService userService;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
//		UserModel data = new UserModel();
//		data.setUserName("Nguyen Van A");
//		data.setPassword("123456");
		UserModel data = HttpUtil.of(request.getReader()).toModel(UserModel.class);
		data = userService.findUser(data.getUserName());
		response.sendRedirect("http://localhost:3000/home");
	}
}
