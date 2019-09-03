<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>글 목록</h1>
	
	
	<table border="1">
		<c:choose>
			<c:when test="${empty list }">
				<tr>
					<td><h3>고객 정보 없습니다.</h3></td>
				</tr>
			</c:when>
			<c:otherwise>
				<tr>
					<th>ID</th>
					<th>NAME</th>
				</tr>
				<c:forEach items="${list }" var="dto">
				<tr>
					<td><a href="selectone.do?id=${dto.id }">${dto.id }</a></td>
					<td>${dto.name }</td>
				</tr>				
				</c:forEach>
				<tr>
					<td colspan="2">
						<input type="button" onclick="location.href='insert.do'" value="고객추가">
					</td>
				</tr>
			</c:otherwise>		
		</c:choose>
	</table>
	
</body>
</html>