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
         <%String nick= (String)session.getAttribute("info"); %>   
   <div>
      <fieldset>
         <legend><h1>�α����� ���̵� ����Ͻÿ�</h1></legend>
         <!-- �Ϲ�ȸ�� �α��� �� ��� �����˻�,����å��,���ã��,ȸ������ ��ư�� �������ϱ� -->
            
            <%if(!nick.equals("admin")) {%>
            
            <button>�����˻�</button>
            <button>����å��</button>
            <button>���ã��</button>
            <button>ȸ������</button>
            <%}else{ %>
            
            
         <!-- admin �α��� �� ��� ȸ������,��������,�뿩��Ȳ,������ ��ư�� �������ϱ� -->
            <button>ȸ������</button>
            <button>��������</button>
            <button>�뿩��Ȳ</button>
            <button>������</button>
            <%} %>
      </fieldset>
   </div>
</body>
</html>