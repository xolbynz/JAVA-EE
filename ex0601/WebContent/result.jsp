<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%-- exam01���� �Է� ���� ���ڸ�ŭ ���̺� td ������ �� �ȿ� 1���� �Է¹��� �� ���� ���� ǥ��  --%>
<table border="1" width="300px" height="300px">
<tr >




---------------------------------------<br>
------------------------------<br>
--------------------------<br>
----------------------<br>
<% 
	String b=request.getParameter("bang");
	int bang=Integer.parseInt(b);
	
	for(int i=1;i<=bang;i++){
%>
	<td width="50px" height="80px">
	30<%=i%>ȣ
	</td>
	<%}%>
	</tr>
	<tr><% 
		for(int i=1;i<=bang;i++){
%> 
	<td width="50px" height="80px">
	20<%=i%>ȣ
	</td>
	<%}%>
	</tr>
		<tr><% 
		for(int i=1;i<=bang;i++){
%>
	<td width="50px" height="80px">
	10<%=i%>ȣ
	</td>
	<%}%>
	</tr>
	</table>

</body>
</html>