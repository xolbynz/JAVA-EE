package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ex06changeBg
 */
@WebServlet("/ex06changeBg")
public class ex06changeBg extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String bgcolor=request.getParameter("bg");
		
		PrintWriter out = response.getWriter();
		System.out.println(bgcolor);
		out.print("<html>");
		out.print("<body bgcolor=");
	
		out.print(bgcolor);out.print("'>");
		
	
	
		
		out.print("</body>");
		
		out.print("</html>");
	}

}
