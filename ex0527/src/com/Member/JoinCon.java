package com.Member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Front.ICommand;


public class JoinCon implements ICommand{
	
	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = null;
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String nickname = request.getParameter("nickname");
		String email = request.getParameter("email");
		String tel = request.getParameter("tel");
		
		
		BookDTO dto = new BookDTO(id, pw, nickname, email,tel);
		BookDAO dao = BookDAO.getDAO();
		
		dao.insert_member(dto);
		
		url = "Question6_Login.jsp";
		
		return url;
	}
	
}
