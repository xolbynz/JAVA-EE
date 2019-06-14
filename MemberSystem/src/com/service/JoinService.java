package com.service;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;


/**
 * Servlet implementation class JoinService
 */
@WebServlet("/JoinService")
public class JoinService extends HttpServlet { 

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("EUC-KR");
		String id = request.getParameter("id");
	    String pw = request.getParameter("pw");
	    String name = request.getParameter("name");
	    
	 MemberDTO dto=new MemberDTO(id,pw,name);
	 memberDAO dao=memberDAO.getDAO();
	 int cnt=dao.join(dto);
	 
	   	if(cnt==1){
	   		response.sendRedirect("main.jsp");
	   	}else{
	   		response.sendRedirect("join.jsp");
	   	}
	   	
	  
	}

}
