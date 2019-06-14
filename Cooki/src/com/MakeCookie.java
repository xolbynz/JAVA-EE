package com;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MakeCookie
 */
@WebServlet("/MakeCookie")
public class MakeCookie extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String []goods =request.getParameterValues("goods");
		 
		 
		for (int i = 0; i < goods.length; i++) {
			
			Cookie cookie = new Cookie("good"+i, URLEncoder.encode(goods[i],"EUC-KR"));
			response.addCookie(cookie);
		}
	response.sendRedirect("main.jsp");	
	}

}
