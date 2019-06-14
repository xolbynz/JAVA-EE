package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ex06mul
 */
@WebServlet("/ex06mul")
public class ex06mul extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		int cnum1 = Integer.parseInt(num1);
		int cnum2 = Integer.parseInt(num2);
		String bgcolor = request.getParameter("bg");

		PrintWriter out = response.getWriter();

		out.print("<html>");
		out.print("<body bgcolor=");

		out.print(bgcolor);
		out.print("'>");

		out.print("<table border= '1px solid black'>");
		for (int j = cnum1; j <= cnum2; j++) {

			out.print("<tr>");
			for (int i = 1; i <= 9; i++) {
				out.print("<td>");
				out.print(j + "*" + i + "=" + j * i);
				out.print("</td>");
			}
			out.print("</tr>");
		}
		out.print("</table>");
		out.print("<html>");
		out.print("</body>");
		out.print("</html>");
	}

}
