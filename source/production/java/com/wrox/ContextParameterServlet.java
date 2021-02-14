package com.wrox;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
		name="contextParameterServlet",
		urlPatterns = {"/contextParameters"})
public class ContextParameterServlet extends HttpServlet {
	/**
	 * add serial verion uid
	 */
	private static final long serialVersionUID = -22736422918417093L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException,IOException{
		ServletContext context = this.getServletContext();
		PrintWriter pw = response.getWriter();
		pw.append("Setting One : ").append(context.getInitParameter("SettingOne"));
		pw.append("Setting Two : ").append(context.getInitParameter("SettingTwo"));
	}
}
