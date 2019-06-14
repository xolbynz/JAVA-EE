package com.Member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Front.ICommand;
import com.Member.BookDAO;
import com.Member.BookDTO;

public class LoginCon implements ICommand{
	
	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = null;
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		BookDTO dto = new BookDTO(id, pw);
		BookDAO dao = BookDAO.getDAO();
		
		String my = dao.login_member(dto);
		
		if(my != null) {
			HttpSession session = request.getSession();
			session.setAttribute("info", my);
		}
		
		url = "Question6_Main.jsp";
		
		return url;
		
	}
	
}
