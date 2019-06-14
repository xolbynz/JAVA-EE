package com.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.front.ICommand;
import com.messeage.MessageDAO;

public class MessageDeleteService implements ICommand {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String num = request.getParameter("num");
		int c_num=Integer.parseInt(num);
		MessageDAO dao= new MessageDAO();
		dao.delete(c_num);
		
		return "main.jsp";
	}

}
