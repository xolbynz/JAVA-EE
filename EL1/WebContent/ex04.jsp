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
	
	${paramValues.sports[0]}
	${paramValues.sports[1]}
	${paramValues.sports[2]}
</body>
</html>