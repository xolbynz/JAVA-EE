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
    
    // 1.�����ε� ��� (dbms�� ����� ������ ���)
    Class.forName("oracle.jdbc.driver.OracleDriver");
	//2.DriverManager�� ����  Java�� Oracle DB�� �����ϴ� Connection ��ü�� �����´�.
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
    String user = "hr";
    String password = "hr";
	Connection conn= DriverManager.getConnection(url,user,password);
    
    //3.pst preparedstatemnet��ä�� connection�κ��� �����ͼ� sql���� �غ� �� ������ ��Ų��.
	String sql ="insert into member values(?,?,?)";
    PreparedStatement pst =conn.prepareStatement(sql);
    pst.setString(1, id);
    pst.setString(2, pw);
    pst.setString(3, name);
    
    int cnt = 0;
   	cnt=pst.executeUpdate();
   	//4. JDBC�� ����� ���������� �������� �ݾ��ؤ���
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