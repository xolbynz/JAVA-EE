package com.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.MemberDAO;
import com.DTO.MemberDTO;
import com.front.ICommand;

public class JoinService implements ICommand{
	 
	
		public String execute(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
			String url=null;
			
			
			String email= request.getParameter("email");
		    String pw = request.getParameter("pw");
		    String tel = request.getParameter("tel");
		    String addr = request.getParameter("addr");
		    
		    
		   MemberDAO dao= new MemberDAO();
		   MemberDTO dto= new MemberDTO(email, pw, tel, addr);
		   
		   int cnt = dao.join(dto);
		   if (cnt>0) {
			  url="main.jsp";

		   }else {
			   
		   }
			
			return url;
		}
}
