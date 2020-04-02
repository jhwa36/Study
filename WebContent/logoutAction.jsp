<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<% response.setContentType("text/html; charset=UTF-8"); %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Jsp 게시판 웹 사이트</title>
</head>
<body>
<!-- session.invalidate()를 해서 현재 이 페이지에 접속한 회원이 session을 빼앗기게 만들어서 로그아웃하게 만들어주는 것. -->
	<%
		session.invalidate();
	%>
	<script>
		location.href='main.jsp';
	</script>
</body>
</html>