<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#loginchk").hide();
	})
	
	function login(){
		var idVal = $("#id").val();
		var pwVal = $("#pw").val();
		alert(idVal + ":" + pwVal);
		
		if(idVal == "" || idVal == null){
			alert("아이디를 다시 한 번 확인해 주세요.");
		} else if(pwVal== "" || pwVal == null){
			alert("비밀번호를 다시 한 번 확인해 주세요.");
		} else{
			
			$("#loginchk").show();
			// 있으면 있다 없으면 없다 체크
			$.ajax({
				type : "post",
				url : "loginajax.do",
				data : "id=" + idVal+ "&pw="+pwVal,
				success : function(msg){
					alert(msg);
				},
				error : function(){
					alert("로그인 실패!");
				}
			})
		}
	}
</script>

</head>
<body>

	<h1>LOGIN</h1>
	
	<table>
		<tr>
			<th>아이디</th>
			<td><input type="text" id="id"> </td>
		</tr>
		<tr>
			<th>비밀번호</th>
			<td><input type="text" id="pw"></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="button" value="login" onclick="login()">
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center" id="loginchk"></td>
		</tr>
	</table>
	
</body>
</html>