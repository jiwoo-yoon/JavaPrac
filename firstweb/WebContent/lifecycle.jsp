<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
HI!
<%
	System.out.print("jspService()"); //System.out 콘솔, out.print() 요청한 페이지
%>

<!-- 
	밑에있는 거는 선언식이라고한다, 어떤 특정한 메서드를 서비스메서드가 아니라
	필드나 다른 메서드로 지정을 하고 싶을때 사용할 수 있다.
-->

<%!
	public void jspInit(){
	System.out.print("jspInit()");
}
%>

<%!
	public void jspDestroy(){
	System.out.print("jspDestroy()111");
}
%>
</body>
</html>