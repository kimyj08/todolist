<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>

	<h1 align="center">회원가입</h1>
	<hr>
	<form action="insertUsers.me" method="post">
		<table border="1" cellpadding="0" cellspacing="0" align="center">
			<tr>
				<td>아이디</td>
				<td><input type="text" name="id" value="${user.id}"/></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="password" value="${user.password}"/></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="name" value="${user.name}"/></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="가입하기"/></td>
			</tr>
		</table>
	</form>

</body>
</html>