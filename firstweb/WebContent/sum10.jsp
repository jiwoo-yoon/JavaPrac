<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<!--Scriptlet ~ 자바코드를 입력할수 있는 부분, jsp는 항상 servlet으로 바뀌고 실행된다. -->
<body>

<% 
    int total = 0;
    for(int i = 1; i <= 10; i++){
        total = total + i;
    }
%>

1부터 10까지의 합 : <%=total %> <!-- out.print-->

</body>
</html>