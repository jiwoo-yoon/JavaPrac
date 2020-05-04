<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<% //scriptlet(java에선 service에 해당)은 쪼개서 사용할 수 있다.
	//프로그래밍 코드 기술에 대한 사용
for(int i = 1; i <= 5; i++){
%>

<H<%=i %>> 아름다운 한글 </H<%=i %>> 

<%
//<%= 이건 표현식 화면에 출혁할 내용 기술에 사용
}
%>
</body>
</html>