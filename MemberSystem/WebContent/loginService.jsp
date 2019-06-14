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
  
    
    // 1.동적로딩 어떠한 (dbms를 사용할 것인지 명시)
    Class.forName("oracle.jdbc.driver.OracleDriver");
	//2.DriverManager를 통해  Java와 Oracle DB를 연결하는 Connection 객체를 가져온다.
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