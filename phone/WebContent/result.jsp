<%@page import="com.PhoneDTO"%>
<%@page import="java.util.Enumeration"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table border="1px solid black">
		<tr>
			<td>순번</td>
			<td>이름</td>
			<td>전화번호</td>
			<td>나이</td>
			<td>성별</td>
			<td>주소</td>
		</tr>
		<%
		
		 ArrayList<PhoneDTO> list =(ArrayList)session.getAttribute("list");
		for(int i=0; i<list.size();i++){%>

		<tr>
			<td><%=(i+1) %></td>
			<td><%=list.get(i).getName()%></td>
			<td><%=list.get(i).getPhone()%></td>
			<td><%=list.get(i).getAge()%></td>
			<td><%=list.get(i).getGender()%></td>
			<td><%=list.get(i).getAddr()%></td>
		</tr>


		<%
		}
		
		%>

	</table>




</body>
</html>