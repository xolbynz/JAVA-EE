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

	ID: ${param.id}<br>
	NAME: ${param.NAME}<br>
	GENDER:${param.gender}<br>
	HOBBY: ${paramValues.hobby[0]}${paramValues.hobby[1]}${paramValues.hobby[2]}${paramValues.hobby[3]}${paramValues.hobby[4]}${paramValues.hobby[5]}${paramValues.hobby[6]}${paramValues.hobby[7]}${paramValues.hobby[8]}<br>
	STORY:${param.story}
	
	<%request.setAttribute("pw", 5555);%>
	<%session.setAttribute("pw", 1324);%>
비밀번호<${sessionScope.pw }
	
	
</body>
</html>