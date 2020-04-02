<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.io.PrintWriter"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device=width" , initial-scale="1">
<link rel="stylesheet" href="css/bootstrap.css">
<title>Jsp 게시판 웹 사이트</title>
</head>
<body>
	<!-- 로그인 된 사람들은 로그인 정보를 담아줄 수 있도록 구현.
	현재 session 존재하는 사람이라면 ID값을 그대로 받아 관리해준다. -->
	<%
		String userID = null;
		if (session.getAttribute("userID") != null) {
			userID = (String) session.getAttribute("userID");
		}
	%>
	<!-- nav = 하나의 웹 사이트의 전반적인 구성을 보여주는 역할 -->
	<nav class="navbar navbar-default">
		<div class="navbar-header">
			<!-- 헤더 부분 -->
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
				aria-expanded="false">
				<span class="icon-bar"></span>
				<!-- 메뉴바 아이콘이라고 생각하면 됨.-->
				<span class="icon-bar"></span> <span class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="main.jsp">JSP 게시판 웹 사이트</a>
		</div>
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
				<!-- ul = 하나의 리스트를 보여줄 때 사용한다. -->
				<li class="active"><a href="main.jsp">게시판</a></li>
				<!-- li = 리스트 -->
				<li><a href="bbs.jsp">게시판</a></li>
			</ul>
			<!-- 로그인이 되어있지 않은 경우 보여지는 화면 -->
			<%
				if (userID == null) {
			%>
			<ul class="nav navbar-nav navbar-right">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" role="button" aria-haspopup="true"
					aria-expanded="false">접속하기<span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="login.jsp">로그인</a></li>
						<li class="active"><a href="join.jsp">회원가입</a></li>
					</ul></li>
			</ul>
			<%
				} else {
			%>
			<!-- 로그인 되어있는 경우 보여지는 화면 -->
			<ul class="nav navbar-nav navbar-right">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" role="button" aria-haspopup="true"
					aria-expanded="false">회원관리<span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="logoutAction.jsp">로그아웃</a></li>
					</ul></li>
			</ul>
			<%
				}
			%>
		</div>
	</nav>
	<div class="container">
		<div class="row"> <!-- 테이블이 들어갈 공간 -->
			<table class="table table-striped" style="text-align:center; border: 1px solid #dddddd" > <!-- table-striped 홀수와 짝수가 서로 번갈아가며 색상이 변경해주는 요소 -->
				<thead>
					<tr>
						<th style="background-color: #eeeeee; text-align:center;">번호</th>
						<th style="background-color: #eeeeee; text-align:center;">제목</th>
						<th style="background-color: #eeeeee; text-align:center;">작성자</th>
						<th style="background-color: #eeeeee; text-align:center;">작성일</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>1</td>
						<td>안녕하세요</td>
						<td>홍길동</td>
						<td>2020-03-27</td>
					</tr>
				</tbody>
			</table>
			<a href="write.jsp" class="btn btn-primary pull-right">글쓰기</a>
		</div>
	</div>
	
	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="js/bootstrap.js"></script>
	<!-- span태그 넣은 것 = 아이콘 -->
	<!-- href="#"은 현재 가르치는 링크가 없다. -->
</body>
</html>