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
	<h1>업데이트!!!!!!</h1>
	
	<form action="updateres.do" method="post">
	<table border="1">
		<tr>
			<th>아이디</th>
				<td>
					<input readonly="readonly" value="${dto.id }" name="id">
				</td>
		</tr>
		<tr>
			<th>비밀번호</th>
				<td>
					<input type="password" value="${dto.password }" name="password" >
				</td>
		</tr>
		<tr>
			<th>이름</th>
				<td>
					<input type="text" value="${dto.name }" name="name">
				</td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="수정완료">
				<input type="button" value="취소" onclick="location.href='selectone.do?id=${dto.id }'">
			</td>
		</tr>
	
	</table>
	
	
	</form>
</body>
</html>