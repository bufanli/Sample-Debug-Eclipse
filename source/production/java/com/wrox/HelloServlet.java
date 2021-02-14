package com.wrox;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
		name="helloServlet",
		urlPatterns={"/greeting","/salutation","/wazzup"},
		loadOnStartup=1
		)
public class HelloServlet extends HttpServlet {

	/**
	 * add serial version
	 */
	private static final long serialVersionUID = 1L;
	private static final String DEFAULT_USER= "Guest";

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
		String user = request.getParameter("user");
		if(user == null){
			user = DEFAULT_USER; 
		}
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter pw = response.getWriter();
		pw.append("<!DOCTYPE html>\r\n")
		  .append("<html>\r\n")
		  .append("	<head>\r\n")
		  .append("		<title>Hello,user application</title>\r\n")
		  .append("	</head>\r\n")
		  .append("	<body>\r\n")
		  .append("		Hello, ").append(user).append("!<br/><br/>\r\n")
		  .append("	<form action=\"greeting\" method=\"post\">\r\n")
		  .append("		Enter your name:<br/>\r\n")
		  .append("		<input type=\"text\" name=\"user\"><br/>\r\n")
		  .append("		<input type=\"submit\" value=\"submit\"><br/>\r\n")
		  .append("	</form>\r\n")
		  .append("</body>\r\n")
		  .append("</html>\r\n");
	}

}
