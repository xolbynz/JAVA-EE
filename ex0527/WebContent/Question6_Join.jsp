<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="myCSS.css">
</head>
<body>
	<div>
		<fieldset>
			<legend><h1>ȸ������</h1></legend>
				<form action="JoginCon.do">
					<table align="center">
						<tr>
							<td>ID</td>
							<td><input type="text" required="required" ></td>
							<td rowspan="5" ><input type="submit" value="����" name = "id"></td>
						</tr>
						<tr>
							<td>PW</td>
							<td><input type="password" required="required" name = "pw"></td>
						</tr>
						<tr>
							<td>NICKNAME</td>
							<td><input type="text" required="required" name = "nickname"></td>
						</tr>
						<tr>
							<td>EMAIL</td>
							<td><input type="text" required="required" name = "email"></td>
						</tr>
						<tr>
							<td>TEL</td>
							<td><input type="text" required="required" name = "tel"></td>
						</tr>
					</table>
				</form>
		</fieldset>
	</div>
</body>
</html>