<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>투두 목록</title>

<script type="text/javascript">
	function getCbValue(obj) {
		if() {
			
		}
		
		document.getElementById('complete').value = '';
	}
</script>

</head>
<body>
	<center>
		<h1>투두 목록</h1>
		<h3>${userName}님! 투두리스트에 오신 것을 환영합니다 :) <a href="logout.me">로그아웃</a></h3>
		
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
				<td width="430">내용</td>
				<td width="200">등록일</td>
				<td width="70">달성여부</td>
			</tr>
			<c:forEach items="${todolistList}" var="todolist">
				<tr>
					<td align="center">
						<input type="checkbox" id="complete" name="complete" value="" onclick="getCbValue(obj)" />&nbsp;
						<a href="getTodolist.do?td_no=${todolist.td_no}">${todolist.td_content}</a>
					</td>
					<td align="center">${todolist.td_date}</td>
					<td align="center">${todolist.complete}</td>
				</tr>
			</c:forEach>
		</table>
		<br>
		
		<a href="insertTodolist.do">투두 등록</a>&nbsp;&nbsp;&nbsp;
		<a href="getUsers.me">내 정보</a>
	</center>
</body>
</html>