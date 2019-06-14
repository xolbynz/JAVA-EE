package com.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DTO.MemberDTO;
import com.front.ICommand;
import com.messeage.MessageDAO;

public class MessageDeleteAll implements ICommand {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		HttpSession session = request.getSession();
		 MemberDTO info=(MemberDTO)session.getAttribute("info");
		 MessageDAO dao= new MessageDAO();
		 dao.deletAll(info.getEmail());
		 
		
		return null;
	}

}
