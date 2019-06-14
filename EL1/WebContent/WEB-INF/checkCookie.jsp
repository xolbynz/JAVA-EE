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
			Cookie[] cookie=request.getCookies();
		for(int i =0; i<cookie;i++){
			if(cookies[1].getqual){
				out.print(cookie.getClass());
			}
		}
		<br>
		
		${cookie.name.value}
		%>
</body>
</html>