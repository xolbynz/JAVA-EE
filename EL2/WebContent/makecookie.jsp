<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body><%

	Cookie cookie = new Cookie("name","pbk");
response.addCookie("pbk");
response.sendRedirect("checkCookie.jsp");
%>

</body>
</html>