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
	
</body>
</html>