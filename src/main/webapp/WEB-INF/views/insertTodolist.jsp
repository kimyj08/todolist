<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>투두리스트 등록</title>
</head>
<body>

	<center>
		<h1>투두리스트 등록</h1>
		<a href="logout.do">Log-out</a>
		<hr>
		<form action="insertTodolist.do" method="post">
			<table border="1" cellpadding="0" cellspacing="0">
				<tr>
					<td width="70">내용</td>
					<td align="left"><input type="text" name="td_content"></input></td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="등록"/>
					</td>
				</tr>
			</table>
		</form>
		<hr>
		<a href="getTodolistList.do">투두 목록 가기</a>
	</center>

</body>
</html>