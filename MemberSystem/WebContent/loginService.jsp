<%@page import="java.net.URLEncoder"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.sun.corba.se.spi.orbutil.fsm.Guard.Result"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<% 
	request.setCharacterEncoding("EUC-KR");
	String id = request.getParameter("id");
    String pw = request.getParameter("pw");
  
    
    // 1.�����ε� ��� (dbms�� ����� ������ ���)
    Class.forName("oracle.jdbc.driver.OracleDriver");
	//2.DriverManager�� ����  Java�� Oracle DB�� �����ϴ� Connection ��ü�� �����´�.
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
    String user = "hr";
    String password = "hr";
	Connection conn= DriverManager.getConnection(url,user,password);
	
	String sql ="select name from member where id=? and pw=?";
    PreparedStatement pst =conn.prepareStatement(sql);
    
    pst.setString(1, id);
    pst.setString(2, pw);
    
   ResultSet rs= pst.executeQuery();
    String name =null;
   if(rs.next()){
	   name= rs.getString(1);
   } rs.close();
   pst.close();
   conn.close();
   
   	if(name !=null){
   		response.sendRedirect("loginSuccess.jsp?name="+URLEncoder.encode(name,"EUC-KR"));
   	}else{
   		response.sendRedirect("login.jsp");
   	}
    
    %>
</body>
</html>