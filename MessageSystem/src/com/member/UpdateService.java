package com.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.MemberDAO;
import com.DTO.MemberDTO;
import com.front.*;

public class UpdateService implements ICommand{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("EUC-KR");
		
		HttpSession session = request.getSession();
		MemberDTO info =(MemberDTO)session.getAttribute("info");
		String email=info.getEmail();
		String pw=request.getParameter("pw");
		String tel=request.getParameter("tel");
		String addr=request.getParameter("addr");
		
		MemberDTO dto= new MemberDTO(email, pw, tel, addr);
		MemberDAO dao=new MemberDAO();
		int cnt = dao.update(dto);
		
		if(cnt>0) {
			info.setTel(tel);
			info.setAddr(addr);
			session.setAttribute("info", info);
			
			System.out.println("업데이트성공");
			return "main.jsp";
		}else {
			
			System.out.println("업데이트성공");
			return "update.jsp";
		}
		
		
	
	}

}
