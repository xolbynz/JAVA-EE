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
	
	Cookie[] cookies=request.getCookies();
	for(int i = 0; i<cookies.length; i++){
		if(cookies[i].getName().equals("id")){
			out.print(cookies[i].getValue()+"님 황영합니다.");
		}
	}
%>
	<a href="logout.jsp">로그아웃</a>
</body>
</html>