<%@page import="com.Member"%>
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

pageContext.setAttribute("num", 10);
request.setAttribute("num", 20);
session.setAttribute("num", 30);
application.setAttribute("num", 40);

Member m = new Member("박병관",22);
pageContext.setAttribute("member", m);

%>
${num } <!--  el식은 가장 작은 영역의 값을 뽑는다. -->

${sessionScope.num }
${member.name}	
${member.age } 

</body>
</html>