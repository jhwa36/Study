<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <% request.setCharacterEncoding("UTF-8"); %>
<% response.setContentType("text/html; charset=UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<table border="1">
		<tr>
			<th>아이디</th>
			<td><input type="text" value="${dto.id }" name="id"></td>
		</tr>
		<tr>
			<th>비밀번호</th>
			<td><input type="password" value="${dto.password }" name="password">
		</tr>
		<tr>
			<th>이름</th>
			<td><input type="text" value="${dto.name }" name="name"> </td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="button" value="수정하기" onclick="location.href='update.do?id=${dto.id}'">
				<input type="button" value="삭제" onclick="location.href='delete.do?id=${dto.id}'">
				<input type="button" value="목록" onclick="location.href='list.do'">
			</td>
		</tr>
		
	</table>
	
</body>
</html>