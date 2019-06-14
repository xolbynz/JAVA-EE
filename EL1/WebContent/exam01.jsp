<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%request.setAttribute("name", "박병관"); %>
	<%request.setAttribute("num1", 10);%>
	<%=request.getAttribute("name") %>
	<%request.setAttribute("num2", 20); %>
	<%request.setAttribute("num", 100); %>
	${name}
	${num+100 }
	${num>100?true:false }

	${age} <!-- 널이면 출력안함 . --><br>
	${not empty age }<br>
	
	${num1>5 and num2>10 }<br>
	${num1>20 or num2>7 }<br>
</body>
</html>