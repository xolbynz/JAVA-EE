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
			<td>����</td>
			<td>�̸�</td>
			<td>��ȭ��ȣ</td>
			<td>����</td>
			<td>����</td>
			<td>�ּ�</td>
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