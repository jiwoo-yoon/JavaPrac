<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
    StringBuffer url = request.getRequestURL();

    out.println("url : " + url.toString());
    out.println("<br>");
    /*
    	내장객체(_javaService라는 매서드안에 코드로 생성)의 종류
    	- 따로 선언안해도 사용 가능
    	- JSP선언문에서 선언하면 SERVLET에서는 SERVICE메소드 밖에서 선언하는것, 
    	    하지만 내장객체는 서블릿 메소드 안에 선언 되어있기 때문에 사용할 수 없다.
    	-request : HTML Form 요소 선택 값가 같은 사용자 입력정보를 읽어올때 사용
    	-response : 사용자 요청에 대한 응답을 처리할 때  사용
    	-pageContext : 현재 JSP실행에 대한 context정보를 참조하기 위해 사용
    	-session : 클라이언트 세션 정보를 처리하기 위해 사용
    	-applicateon : 웹서버의 어플리케이션 처리와 관련되 정보를 참조하기 위해 사용
    	-out : 사용자에게 전달하기 위한 output스트림을 처리하기 위해 사용
    	-config : 현재 JSP에 대한 초기화 환경을 처리하기 위해 사용
    	-page : 현재 JSP페이지에 대한 클래스 정보
    	-exception : 예외처리를 위해 사용
    */
%>
</body>