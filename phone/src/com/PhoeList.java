package com;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class PhoeList
 */
@WebServlet("/PhoeList")
public class PhoeList extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PhoneDTO p1= new PhoneDTO("�̱⼺", "010-1111-2222", 22, "����", "����");
		PhoneDTO p2= new PhoneDTO("����", "010-2222-2222", 23, "����", "������");
		PhoneDTO p3= new PhoneDTO("������", "010-3333-4444", 26, "����", "�ϵ�");
		PhoneDTO p4= new PhoneDTO("�̸�ȣ", "010-5555-6666", 27, "����", "����");
		PhoneDTO p5= new PhoneDTO("�ں���", "010-7777-8888", 22, "����", "����");
		PhoneDTO p6= new PhoneDTO("�赿��", "010-7777-8888", 55, "����", "�۾ϵ�");
		
		ArrayList<PhoneDTO> list= new ArrayList<PhoneDTO>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		list.add(p6);
		
		
		HttpSession session = request.getSession();
		session.setAttribute("list", list);
		
		response.sendRedirect("result.jsp");
		
		
	}

}
