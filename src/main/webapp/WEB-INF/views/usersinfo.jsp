<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
					<td align="left">
						<input name="password" type="text" value="${users.password}"/>
					</td>
				</tr>
				<tr>
					<td>이름</td>
					<td align="left">
						<input name="password" type="text" value="${users.name}"/>
					</td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="정보 수정" />
					</td>
				</tr>
			</table>
		</form>
		
		<p>아이디는 변경하실 수 없습니다.</p>
		
		<hr>
		<a href="insertTodolist.do">투두 등록</a>&nbsp;&nbsp;&nbsp;
		<a href="getTodolistList.do">투두 목록</a>&nbsp;&nbsp;&nbsp;
		<a href="deleteUsers.me">회원 탈퇴</a>
	</center>
</body>
</html>