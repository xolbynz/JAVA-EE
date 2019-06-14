package com.service;

import java.io.IOException;
import java.net.URLEncoder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginService
 */
@WebServlet("/loginService")
public class loginService extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("EUC-KR");
		String id = request.getParameter("id");
	    String pw = request.getParameter("pw");
	    
	    MemberDTO dto=new MemberDTO(id,pw);
	    memberDAO dao= memberDAO.getDAO();
	    String name=dao.login(dto);
	    
	   
		 
		   	if(name !=null){
		   		response.sendRedirect("loginSuccess.jsp?name="+URLEncoder.encode(name,"EUC-KR"));
		   	}else{
		   		response.sendRedirect("login.jsp");
		   	}
			
		} 


}
