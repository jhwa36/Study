<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="bbs.BbsDao" %>
<%@ page import="java.io.PrintWriter" %>

<jsp:useBean id="bbs" class="bbs.Bbs" scope="page"/>
<jsp:setProperty property="bbsTitle" name="bbs"/>
<jsp:setProperty property="bbsContent" name="bbs"/>
<% request.setCharacterEncoding("UTF-8"); %>
<% response.setContentType("text/html; charset=UTF-8"); %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Jsp 게시판 웹 사이트</title>
</head>
<!-- 
	userID == null 로그인이 안되어 있다면 로그인하라는 경고창띄운다.
	로그인 했을 경우에 글 작성할 수 있게 해주고,
	글 제목이나 글의 내용을 입력하지 않은 경우 오류 발생
 	if(bbs.getBbsTitle() == null || bbs.getBbsContent() == null ){
 	
	result == -1인경우 데이터베이스 오류가 발생한 것
-->
<body>
	<%
			String userID = null;
			if(session.getAttribute("userID") != null){
				userID = (String) session.getAttribute("userID");
			}
			if(userID == null){
				PrintWriter script = response.getWriter();
				script.println("<script>");
				script.println("alert('로그인을 하세요')");
				script.println("location.href='login.jsp'");
				script.println("</script>");
			}else{
				if(bbs.getBbsTitle() == null || bbs.getBbsContent() == null ){
							PrintWriter script = response.getWriter();
							script.println("<script>");
							script.println("alert('입력 안 된 사항이 있습니다.')");
							script.println("history.back()");
							script.println("</script>");
						}else{
							BbsDao bbsDao = new BbsDao();
							int result = bbsDao.write(bbs.getBbsTitle(), userID, bbs.getBbsContent());
							if (result == -1){
								PrintWriter script = response.getWriter();
								script.println("<script>");
								script.println("alert('글쓰기에 실패했습니다.')");
								script.println("history.back()");
								script.println("</script>");
							}else {
								PrintWriter script = response.getWriter();
								script.println("<script>");
								script.println("location.href='bbs.jsp'");
								script.println("</script>");
							}
						}
			}
	%>
</body>
</html>