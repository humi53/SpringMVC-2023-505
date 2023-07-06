<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set value="${pageContext.request.contextPath }" var="rootPath" />
<c:set value="20230705-001" var="version" />
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="${rootPath }/static/css/home.css?${version}" rel="stylesheet">
</head>
<body>
	<div>
		<h1>TO DO List 2023</h1>
	</div>
	<div>
		<input class="" type="text" placeholder="작성일자">
		<input class="" type="text" placeholder="작성시각">
		<input class="" type="text" placeholder="할일">
	</div>
	<div>
		<table class="main list">
			<tr>
				<th>No.</th>
				<th>할일</th>
				<th>완료여부</th>
			</tr>
			<tr data-id="">
				<td>1</td>
				<td></td>
				<td></td>
			</tr>
			<tr data-id="">
				<td>2</td>
				<td></td>
				<td></td>
			</tr>
		</table>
	</div>
	
</body>
</html>