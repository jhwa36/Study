<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="user.UserDao" %>
<%@ page import="java.io.PrintWriter" %>

<jsp:useBean id="user" class="user.User"/>
<jsp:setProperty property="userID" name="user"/>
<jsp:setProperty property="userPassword" name="user"/>
<jsp:setProperty property="userName" name="user"/>
<jsp:setProperty property="userGender" name="user"/>
<jsp:setProperty property="userEmail" name="user"/>
<% request.setCharacterEncoding("UTF-8"); %>
<% response.setContentType("text/html; charset=UTF-8"); %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Jsp 게시판 웹 사이트</title>
</head>
<!-- 하나라도 null값이 있을 경우의 수 체크 
	join 변수에 각각의 변수들을 입력받아 하나의 user라는 인스턴스가 join함수를 사용하도록 매개변수가로 들어간다.
	
	데이터베이스 오류가 발생할 경우 = 해당 아이디가 존재하는경우 밖에 없다.
	userID에 primary key를 주었기에 단 하나만이 존재하는 아이디가 되어야한다.
	동일한 아이디가 있을경우 에러가 발생한다.
	
	result -1이 아닌경우는 전부 다 회원가입이 이루어진 경우이다.
	login 되었을경우 main.jsp로 바로 화면을 이동시켜준다.
-->
<body>
	<%
	
			String userID = null;
			if(session.getAttribute("userID") != null){
				userID = (String) session.getAttribute("userID");
			}
			if(userID != null){
				PrintWriter script = response.getWriter();
				script.println("<script>");
				script.println("alert('이미 로그인 되어 있습니다.')");
				script.println("location.href='main.jsp'");
				script.println("</script>");
			}
			if(user.getUserID() == null || user.getUserPassword() == null || user.getUserName() == null || user.getUserGender() == null || 
			user.getUserEmail() == null){
				PrintWriter script = response.getWriter();
				script.println("<script>");
				script.println("alert('입력 안 된 사항이 있습니다.')");
				script.println("history.back()");
				script.println("</script>");
			}else{
				UserDao userDao = new UserDao();
				int result = userDao.join(user);
				if (result == -1){
					PrintWriter script = response.getWriter();
					script.println("<script>");
					script.println("alert('이미 아이디가 존재합니다.')");
					script.println("history.back()");
					script.println("</script>");
				}else {
					session.setAttribute("userID", user.getUserID());
					PrintWriter script = response.getWriter();
					script.println("<script>");
					script.println("location.href='main.jsp'");
					script.println("</script>");
				}
			}
	
	
	
	
	%>
</body>
</html>