<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>DOM 다루기 </h1>
<p onmouseover="change()">dom은 html 요소를 객체화 해주는 모델이다 .</p>
<button onclick="change()">클릭!</button>
 	<script type="text/javascript">
 	function change(){
 	var h1=document.getElementsByTagName('h1');
	var p=document.getElementsByTagName('p');
 	 
 	 //alert(h1[0]);
 	 
 	 
 	 //h1태그  내 내용 변경 
 	 h1[0].innerHTML='DOm 접근하기';
 		p[0].innerHTML='dom은 html 요소를 객체화 해주는 모달이다 .';
 	}
 	
 	</script>
</body>
</html>