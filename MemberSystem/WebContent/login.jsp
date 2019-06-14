<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body background="bihang.jpg">
  <form action="loginService.jsp" method="post">
  	<div align="center">
  	<table>
  		<tr>
  			<td>ID</td>
  			<td><input type="text" name="id"></td>
  		</tr>
  		<tr>
  			<td>PW</td>
  			<td><input type="password" name="pw"></td>
  		</tr>
  		<tr>
  		<td colspan="2">
		<input type="submit" value="로그인">
		<input type="reset" value="초기화">
		</td>
		</tr>
  	</table>
  	</div>
  </form>
</body>
</html>