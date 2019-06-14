package com.messeage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MessageInsertService
 */
@WebServlet("/MessageInsertService")
public class MessageInsertService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("EUC-KR");
		String send_name=request.getParameter("send_name");
		String receive_email=request.getParameter("receive_email");
		String content=request.getParameter("content");
		
		
		MessageDTO dto=new MessageDTO(send_name, receive_email, content);
		MessageDAO dao=new MessageDAO();
		dao.insert(dto);
		response.sendRedirect("main.jsp");
	}

}
