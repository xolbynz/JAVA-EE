<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>DOM �ٷ�� </h1>
<p onmouseover="change()">dom�� html ��Ҹ� ��üȭ ���ִ� ���̴� .</p>
<button onclick="change()">Ŭ��!</button>
 	<script type="text/javascript">
 	function change(){
 	var h1=document.getElementsByTagName('h1');
	var p=document.getElementsByTagName('p');
 	 
 	 //alert(h1[0]);
 	 
 	 
 	 //h1�±�  �� ���� ���� 
 	 h1[0].innerHTML='DOm �����ϱ�';
 		p[0].innerHTML='dom�� html ��Ҹ� ��üȭ ���ִ� ����̴� .';
 	}
 	
 	</script>
</body>
</html>