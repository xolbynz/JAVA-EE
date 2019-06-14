<%@page import="java.net.URLDecoder"%>
<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
body{
text-align: center;
}
div{

background-color: red;
color: white;
position: fixed;
right: 0px;
top:300px;
}

</style>
</head>
<body>
	<h1>shoe closet</h1>
	<form action="MakeCookie">
	<table border="1px solid black" align="center">
		<tr>
		<td><img src="img/s1.PNG"></td>
		<td><img src="img/s2.PNG"></td>
		<td><img src="img/s3.PNG"></td>
		<td><img src="img/s4.PNG"></td>
		</tr>
		<tr>
		<td><input type="checkbox" name="goods" value="s1"></td>
		<td><input type="checkbox" name="goods" value="s2"></td>
		<td><input type="checkbox" name="goods" value="s3"></td>
		<td><input type="checkbox" name="goods" value="s4"></td>
		</tr>
		<tr>
		<td>2152$</td>
		<td>1245$</td>
		<td>5812$</td>
		<td>982$</td>
		</tr>
		<tr>
		<td><img src="img/s5.PNG"></td>
		<td><img src="img/s6.PNG"></td>
		<td><img src="img/s7.PNG"></td>
		<td><img src="img/s8.PNG"></td>
		</tr>
		<tr>
		<td><input type="checkbox" name="goods" value="s5"></td>
		<td><input type="checkbox" name="goods" value="s6"></td>
		<td><input type="checkbox" name="goods" value="s7"></td>
		<td><input type="checkbox" name="goods" value="s8"></td>
		</tr>
		<tr>
		<td>1241$</td>
		<td>822$</td>
		<td>10000$</td>
		<td>2121$</td>
		</tr>
		<tr>
			<td colspan="4"><input type="submit" value="장바구니"> </td>
		</tr>
	
	</table>
	
	</form>
	<%
	Cookie[] cookies=request.getCookies();
	request.setCharacterEncoding("EUC-KR");
	%>
	<div>
	장바구니 목록 <br>
	
	<%
	
	if(cookies!=null){
		for (int i = 0; i < cookies.length; i++) {
			if(!cookies[i].getName().equals("JSESSIONID")){
			out.print(URLDecoder.decode(cookies[i].getValue(),"EUC-KR"));
			out.print("<br>");
			out.print("<img src='img/"+cookies[i].getValue()+".PNG' width='100px'>");
			out.print("<br>");
			}
		}
	}
	%>
	</div>
	
	
	
	

</body>
</html>