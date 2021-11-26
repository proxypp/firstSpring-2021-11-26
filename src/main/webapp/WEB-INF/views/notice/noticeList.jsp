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
	<div><h1>공지사항 목록</h1></div>
	<div>
		<c:forEach items="${notices}" var="notice">
			${notice.no } : ${notice.name } : ${notice.title } : ${notice.wdate }<br>
		</c:forEach>
	</div>
	<div>
		<button type="button" onclick="location.href='noticeForm.do'">글쓰기</button>
	</div>
</div>
</body>
</html>