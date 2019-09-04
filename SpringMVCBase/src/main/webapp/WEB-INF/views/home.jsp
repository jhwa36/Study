<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<h1>전체목록</h1>
	<table border="1">
		<c:choose>
			<c:when test="${empty list }">
				<tr>
					<td><h1>글 목록이 없네요</h1></td>
				</tr>
			</c:when>
			<c:otherwise>
				<tr>	
					<th>EMPNO</th>
					<th>ENAME</th>
					<th>SAL</th>
					<th>DEPTNO</th>
				</tr>
				<c:forEach items="${list }" var="dto">
					<tr>
					 	<td><a href="selectone.do?empno=${dto.empno }">${dto.empno }</a></td>
						<td>${dto.ename }</td>
						<td>${dto.sal }</td>
						<td>${dto.deptno }</td>
					</tr>
				</c:forEach>
				<tr>
					<td colspan="1">
						<input type="button" value="추가" onclick="location.href='insert.do'">
					</td>
				</tr>
			</c:otherwise>			
		</c:choose>
	</table>

</body>
</html>
