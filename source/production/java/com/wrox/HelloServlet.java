package com.wrox;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	/**
	 * add serial version
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
		System.out.println("hello,init");
	}

	@Override
	public void destroy() {
		System.out.println("hello,destroy");
	}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().println("hello,servlet");

	}

}
