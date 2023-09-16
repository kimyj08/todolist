<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>투두 목록</title>
</head>
<body>
	<center>
		<h1>투두 목록</h1>
		<h3>${userName}님! 투두리스트에 오신 것을 환영합니다 :) <a href="logout.do">로그아웃</a></h3>
		
		<!-- 검색 시작 -->
		<form action="getTodolistList.do" method="post">
			<table border="1" cellpadding="0" cellspacing="0" width="700">
				<tr>
					<td align="right">
						<select name="searchCondition">
							<c:forEach items="${conditionMap}" var="option">
								<option value="${option.value}">${option.key}</option>
							</c:forEach>
						</select>
						<input type="text" name="searchKeyword">
						<input type="submit" value="검색">
					</td>
				</tr>
			</table>
		</form>
		<!-- 검색 종료 -->
		
		<!-- 목록 출력 -->
		<table border="1" cellpadding="0" cellspacing="0" width="700">
			<tr>
				<td width="500">내용</td>
				<td width="200">등록일</td>
			</tr>
			<c:forEach items="${todolistList}" var="todolist">
				<tr>
					<td align="center"><a href="getTodolist.do?td_no=${todolist.td_no}">${todolist.td_content}</a></td>
					<td align="center">${todolist.td_date}</td>
				</tr>
			</c:forEach>
		</table>
		<br>
		
		<a href="insertTodolist.do">투두 등록</a>
	</center>
</body>
</html>