package com.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.MemberDAO;
import com.DTO.MemberDTO;
import com.front.ICommand;

public class LoginService implements ICommand {
	public String execute(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		String url=null;
		
		
		String email = request.getParameter("email");
		String pw = request.getParameter("pw");
		MemberDTO dto = new MemberDTO(email, pw);
		MemberDAO dao = new MemberDAO();
		MemberDTO my = dao.login(dto);

		if (my != null) {
			HttpSession session = request.getSession();	
			session.setAttribute("info", my);
			System.out.println("로그인 성공");

		}

		url="main.jsp";
		
		
		
		return url;
	}

}
