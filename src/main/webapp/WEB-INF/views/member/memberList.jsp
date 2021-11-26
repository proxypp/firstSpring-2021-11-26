<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	<div><h1>멤버 목록</h1></div>
	<div>
		<c:forEach items="${member}" var="members">
			${members.id } : ${members.password } : ${members.name } : ${members.tel } : ${members.address } : ${members.author } <br>
		</c:forEach>
	</div>
</div>
</body>
</html>