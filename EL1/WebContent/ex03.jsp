<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
		<%request.setCharacterEncoding("EUC-KR"); %>
		<%String text= request.getParameter("text"); %>
		<%=text %>
		
		
		${param.text}
</body>
</html>