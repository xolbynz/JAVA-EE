package com.Front;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Front.ICommand;
import com.Member.JoinCon;
import com.Member.LoginCon;


@WebServlet("*.do")
public class FrontController extends HttpServlet {
	
	HashMap<String, ICommand> map = new HashMap<String, ICommand>();
	

	@Override
	public void init() throws ServletException {
		map.put("LoginCon.do", new LoginCon());
		map.put("JoinCon.do", new JoinCon());
	}


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String requestURI = request.getRequestURI(); //Ŭ���̾�Ʈ�� ��û�� ��ü URL
		String contextPath = request.getContextPath(); //Ŭ���̾�Ʈ�� ��û�� ������Ʈ�� �̸�
		String command = requestURI.substring(contextPath.length()+1); // �ڿ� ��û�� �κ� �̰ɷ� ����ϴ� �κ��� �����ֱ� ����
		
		request.setCharacterEncoding("EUC-KR");
		
		ICommand input = map.get(command);
		
		String url = input.execute(request, response);
		response.sendRedirect(url);
		
	}

}
