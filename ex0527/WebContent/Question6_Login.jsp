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
			<legend><h1>�����������α׷�</h1></legend>
				<form action="LoginCon.do">
					<table align="center">
						<tr>
							<td>ID</td>
							<td><input type="text"></td>
							<td rowspan="2" ><input type="submit" value="�α���" name = "id"> </td>
						</tr>
						<tr>
							<td>PW</td>
							<td><input type="password" name = "pw"> </td>
						</tr>
						<tr>
							<td colspan="3">���̵� ���ٸ� <a href="Question6_Join.jsp" >ȸ������</a>Ŭ��</td>
						</tr>
					</table>
				</form>
		</fieldset>
	</div>
</body>
</html>