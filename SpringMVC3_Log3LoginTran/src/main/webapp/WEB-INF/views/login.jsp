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
			alert("아이디가 틀린듯");
		} else if(pwVal == "" || pwVal == null){
			alert("패스워드 틀린듯");
		} else{
			$("#loginchk").show();
			$.ajax({
				type : "post",
				url : "loginajax.do",
				data : "id=" + idVal + "&pw="+pwVal,
				success : function(token){
					alert(token.loginchk); // true 인지 false 인지 알려주는 곳
					alert(idVal+"님 환영합니다~~~~~~~~~~~~~~~");
					if(token.loginchk == true){
						location.href='list.do';	
					}else{
						document.getElementById("loginchk").innerHTML="아이디나 비밀번호 다시 확인바람";
					}
				},
				error : function(){
					alert("로그인실패 ㅠㅠ");
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
			<td><input type="password" id="pw"></td>
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

<!-- 
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
					alert(msg.loginchk);
					//console.log(msg);
					if(msg.loginchk==true){
						location.href='list.do';
					} else{
						document.getElementById("loginchk").innerHTML="아이디 혹은 비밀번호를 다시 한 번 확인해 주세요";
					}
				},
				error : function(){
					alert("로그인 실패!");
				}
			})
		}
	}
	 -->
	