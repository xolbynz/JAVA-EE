package com.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.front.ICommand;
import com.messeage.MessageDAO;
import com.messeage.MessageDTO;

public class Messageinsert implements ICommand{

	
	public String execute(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		
		String send_name=request.getParameter("send_name");
		String receive_email=request.getParameter("receive_email");
		String content=request.getParameter("content");
		
		
		MessageDTO dto=new MessageDTO(send_name, receive_email, content);
		MessageDAO dao=new MessageDAO();
		dao.insert(dto);
		
		
		return "main.jsp";
		
	}
}
