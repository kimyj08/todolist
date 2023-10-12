<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내 정보</title>
</head>
<body>
	<center>
		<h1>내 정보 상세</h1>
		<a href="logout.me">Log-out</a>
		<hr>
		<form action="updateUsers.me" method="post">
			<input name="seq" type="hidden" value="${users.seq}" />
			<table border="1" cellpadding="0" cellspacing="0">
				<tr>
					<td>아이디</td>
					<td align="left">${users.id}</td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td align="left">${users.password}</td>
				</tr>
				<tr>
					<td>이름</td>
					<td align="left">${users.name}</td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="정보 수정" />
					</td>
				</tr>
			</table>
		</form>
		<hr>
		<a href="insertTodolist.do">투두 등록</a>&nbsp;&nbsp;&nbsp;
		<a href="getTodolistList.do">투두 목록</a>&nbsp;&nbsp;&nbsp;
		<a href="usersout.me">회원 탈퇴</a>
	</center>
</body>
</html>