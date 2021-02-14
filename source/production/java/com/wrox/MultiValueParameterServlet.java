package com.wrox;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
		name = "multiValueParameterServlet",
		urlPatterns = {"/checkboxes"})
public class MultiValueParameterServlet extends HttpServlet {

	/**
	 * add serial version
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException,IOException{
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		
		PrintWriter pw = response.getWriter();
		pw.append("<!DOCTYPE html>\r\n")
		  .append("<html>\r\n")
		  .append("    <head>\r\n")
		  .append("        <title>Hello,user application</title>\r\n")
		  .append("    </head>\r\n")
		  .append("    <body>\r\n")
		  .append("        <form action=\"checkboxes\" method=\"post\">\r\n")
		  .append("Select fruits you like to eat</br>\r\n")
		  .append("<input type=\"checkbox\" name=\"fruit\" value=\"Banana\" />\r\n")
		  .append("banana</br>\r\n")
          .append("<input type=\"checkbox\" name=\"fruit\" value=\"Apple\" />\r\n")
		  .append("Apple</br>\r\n")
		  .append("<input type=\"checkbox\" name=\"fruit\" value=\"Orange\" />\r\n")
		  .append("Orange</br>\r\n")
		  .append("<input type=\"checkbox\" name=\"fruit\" value=\"Guava\" />\r\n")
		  .append("Guava</br>\r\n")
		  .append("<input type=\"checkbox\" name=\"fruit\" value=\"Kiwi\" />\r\n")
		  .append("Kiwi</br>\r\n")
		  .append("<input type=\"submit\" value=\"submit\">\r\n")
		  .append("</form>\r\n")
		  .append("</body>\r\n")
		  .append("</html>\r\n");
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException,IOException{
		String[] fruits = request.getParameterValues("fruit");
		PrintWriter pw = response.getWriter();
		pw.append("<!DOCTYPE html>\r\n")
		  .append("<html>\r\n")
		  .append("    <head>\r\n")
		  .append("        <title>Hello,user application</title>\r\n")
		  .append("    </head>\r\n")
		  .append("    <body>\r\n")
		  .append("        <h2>Your Selections</h2>\r\n");
		  if(fruits == null){
			  pw.append("                    You did not select any fruits\r\n");
		  }else{
		      pw.append("<ul>\r\n");
		      for(String fruit:fruits){
		    	  pw.append("<li>").append(fruit).append("</li>\r\n");
		      }
		      pw.append("</ul>\r\n");
		  }
		  pw.append("</body>\r\n");
		  pw.append("</html>\r\n");
	}
}
