<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Driver"%>
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
    String name = request.getParameter("name");
    
    // 1.동적로딩 어떠한 (dbms를 사용할 것인지 명시)
    Class.forName("oracle.jdbc.driver.OracleDriver");
	//2.DriverManager를 통해  Java와 Oracle DB를 연결하는 Connection 객체를 가져온다.
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
    String user = "hr";
    String password = "hr";
	Connection conn= DriverManager.getConnection(url,user,password);
    
    //3.pst preparedstatemnet갹채룰 connection로부터 가져와서 sql문장 준비 및 실행을 시킨다.
	String sql ="insert into member values(?,?,?)";
    PreparedStatement pst =conn.prepareStatement(sql);
    pst.setString(1, id);
    pst.setString(2, pw);
    pst.setString(3, name);
    
    int cnt = 0;
   	cnt=pst.executeUpdate();
   	//4. JDBC이 사용이 끝났음으면 역순으로 닫아준ㄴ다
   	pst.close();
   	conn.close();
    
   	if(cnt==1){
   		response.sendRedirect("main.jsp");
   	}else{
   		response.sendRedirect("join.jsp");
   	}
   	
   	
	%>

</body>
</html>