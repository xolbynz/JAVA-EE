package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hobby
 */
@WebServlet("/Hobby")
public class Hobby extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("EUC-KR");	
		String gender=request.getParameter("gender");
		System.out.println(gender);
		String[] hobby=request.getParameterValues("sports");
		for (String s : hobby) {
			System.out.println(s);
		}
		
		
	}

}
