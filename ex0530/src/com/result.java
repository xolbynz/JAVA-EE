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
		System.out.println("Get 방식 실행");
		System.out.println(name+"을 검색했스빈다.");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id= request.getParameter("id");
		String pw= request.getParameter("pw");
		System.out.println("post 방식 실행");
		
		if(id.equals("pdk")&&pw.equals("1234")) {
			System.out.println("로그인 성공!!");
		}else {
			System.out.println("로그	인 실패 !!!!");
		}
	}

}
