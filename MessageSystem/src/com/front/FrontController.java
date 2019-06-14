package com.front;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.DAO.MemberDAO;
import com.DTO.MemberDTO;
import com.member.JoinService;
import com.member.LoginService;
import com.member.LogoutService;
import com.member.MessageDeleteAll;
import com.member.MessageDeleteService;
import com.member.Messageinsert;
import com.member.UpdateService;
import com.messeage.MessageDAO;
import com.messeage.MessageDTO;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("*.do") // do이면 다받아준다.
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	
	HashMap<String, ICommand> map =new HashMap<String, ICommand>();
	
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		map.put("Login.do",new LoginService());
		map.put("Join.do",new JoinService());
		map.put("Logout.do",new LogoutService());
		map.put("Update.do",new UpdateService());
		map.put("MessageInsert.do",new Messageinsert());
		map.put("MessageDeleteAll.do",new MessageDeleteAll());
		map.put("MessageDelete.do",new MessageDeleteService());
		
		
	}


	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String requsetURI = request.getRequestURI();
		System.out.println(requsetURI);
		String contextPath = request.getContextPath();
		System.out.println(contextPath);
		String command = requsetURI.substring(contextPath.length() + 1);
		System.out.println(command);
		request.setCharacterEncoding("EUC-KR");
		String url = null;
		ICommand input = map.get(command);

//		if (command.equals("Login.do")) {
//
//			input = new LoginService();
//
//		} else if (command.equals("Join.do")) {
//
//			input = new JoinService();
//
//		} else if (command.equals("Logout.do")) {
//			input = new LogoutService();
//
//		} else if (command.equals("Update.do")) {
//			input = new UpdateService();
//
//		} else if (command.equals("MessageInsert.do")) {
//
//			input = new Messageinsert();
//
//		} else if (command.equals("MessageDeleteAll.do")) {
//
//			input = new MessageDeleteAll();
//
//		}
//
//		else if (command.equals("MessageDelete.do")) {
//
//			input = new MessageDeleteService();
//
//		}
		url=input.execute(request, response);
		response.sendRedirect(url);
	}
}
