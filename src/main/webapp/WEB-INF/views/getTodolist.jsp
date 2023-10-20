<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>투두 상세</title>
</head>
<body>
	<center>
		<h1>투두 상세</h1>
		<a href="logout.do">Log-out</a>
		<hr>
		<form action="updateTodolist.do" method="post">
			<input name="td_no" type="hidden" value="${todolist.td_no}" />
			<table border="1" cellpadding="0" cellspacin="0">
				<tr>
					<td>내용</td>
					<td align="left">
						<textarea name="td_content" cols="40" rows="10">${todolist.td_content}</textarea>
					</td>
				</tr>
				<tr>
					<td>등록일</td>
					<td align="left">${todolist.td_date}</td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="내용 수정" />
					</td>
				</tr>
			</table>
		</form>
		<hr>
		<a href="insertTodolist.do">투두 등록</a>&nbsp;&nbsp;&nbsp;
		<a href="deleteTodolist.do?td_no=${todolist.td_no}">투두 삭제</a>&nbsp;&nbsp;&nbsp;
		<a href="getTodolistList.do">투두 목록</a>
	</center>
</body>
</html>