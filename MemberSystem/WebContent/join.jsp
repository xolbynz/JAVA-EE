<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body background="image1.jpg">
	<form action="JoinService" method="post">
	<table>
	<tr><td>ID
	</td><td><input required="required" type="text" name = "id"></td>
	</tr>
	<tr>
	<td>PW</td><td><input  required="required"  type="password" name="pw"></td>
	</tr>
	<tr>
	<td>NAME</td><td><input  required="required"  type="text" name="name"></td>
	</tr>
	<tr>
	<td colspan="2">
		<input type="submit" value="회원가입">
		<input type="reset" value="초기화">
		</td>
	</tr>
	</table>
	</form>



</body>
</html>