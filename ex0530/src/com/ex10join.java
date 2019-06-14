package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ex10join
 */
@WebServlet("/ex10join")
public class ex10join extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("EUC-KR");	//Post 방식일 때 한글 인코딩.
		response.setCharacterEncoding("EUC-KR");	
		
		String id=request.getParameter("id");
		System.out.println(id);
		String name=request.getParameter("name");
		System.out.println(name);
		String email=request.getParameter("email");
		System.out.println(email);
		String tel=request.getParameter("tel");
		System.out.println(tel);
		String gender= request.getParameter("gender");
		System.out.println(gender);
		String color = request.getParameter("color");
		System.out.println(color);
		
		String [] hobby=request.getParameterValues("hobby");
		 for (int i = 0; i < hobby.length; i++) {
	         System.out.print(hobby[i]);
	      }
		
		String date= request.getParameter("birthday");
		System.out.println(date);
		String country=request.getParameter("country");
		System.out.println(country);
		String textarea=request.getParameter("textarea");
		System.out.println(textarea);
		
		response.setContentType("text/html;charset=euc-kr");
		
		PrintWriter out = response.getWriter();
	      out.print("<html>");
	      out.print("<body>");
	      out.print("ID = " + id + "<br>");
	      out.print("NAME = " + name + "<br>");
	      out.print("email = " + email + "<br>");
	      out.print("tel = " + tel + "<br>");
	      out.print("gender = " + gender + "<br>");
	      out.print("hobby = ");
	      for (int i = 0; i < hobby.length; i++) {
	         out.print(hobby[i] + " ");
	      }
	      out.print("<br>");
	      out.print("date = " + date + "<br>");
	      out.print("color = " + color + "<br>");
	      out.print("contry = " + country + "<br>");
	      out.print("talk = " + textarea + "<br>");
	      out.print("</body>");
	      out.print("</html>");

 	}

}
