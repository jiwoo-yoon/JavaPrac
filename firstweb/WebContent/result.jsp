<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 
	EL표기법 밑에 자바식을 간단하게 표현방법 
	JSP에서는 자바식을 줄여야 수정하기 쉽다.	
-->
${v1 } + ${v2 } = ${result }

<%-- <%
	int v1 = (int)request.getAttribute("v1");
	int v2 = (int)request.getAttribute("v2");
	int result = (int)request.getAttribute("result");
%>

<%=v1 %> + <%=v2 %> = <%=result %> --%>
</body>
</html>