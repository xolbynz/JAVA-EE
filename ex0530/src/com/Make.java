package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Make
 */
@WebServlet("/Make")
public class Make extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String num=request.getParameter("num");
		int cnum= Integer.parseInt(num);
		
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("<table border= '1px solid black'>");
		out.print("<tr>");
		out.print("</tr>");
		out.print("</table>");
		out.print("<html>");
		out.print("</body>");
		out.print("</html>");
		
	}

}
