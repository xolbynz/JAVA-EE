package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/result")
public class result extends HttpServlet {
	
	
	


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name= request.getParameter("name");
		System.out.println("Get ��� ����");
		System.out.println(name+"�� �˻��߽����.");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id= request.getParameter("id");
		String pw= request.getParameter("pw");
		System.out.println("post ��� ����");
		
		if(id.equals("pdk")&&pw.equals("1234")) {
			System.out.println("�α��� ����!!");
		}else {
			System.out.println("�α�	�� ���� !!!!");
		}
	}

}
