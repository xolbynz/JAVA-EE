<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%-- exam01에서 입력 받은 숫자만큼 테이블 td 생성한 후 안에 1부터 입력받은 수 까지 숫자 표현  --%>
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
	30<%=i%>호
	</td>
	<%}%>
	</tr>
	<tr><% 
		for(int i=1;i<=bang;i++){
%> 
	<td width="50px" height="80px">
	20<%=i%>호
	</td>
	<%}%>
	</tr>
		<tr><% 
		for(int i=1;i<=bang;i++){
%>
	<td width="50px" height="80px">
	10<%=i%>호
	</td>
	<%}%>
	</tr>
	</table>

</body>
</html>