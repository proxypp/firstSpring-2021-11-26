<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<div>
			<h1>공지사항 등록</h1>
		</div>
		<div>
			<form action="noticeResister.do" id="frm" method="post"> <!-- 파일 전송 할 때는 enctype="multipart/form-data"를 넣어야한다. -->
				<div>
					<table border="1">
						<tr>
							<th width="150">아이디</th>
							<td width="200">
								<input type ="text" id="id" name="id">
							</td>
							<th width="150">작성자</th>
							<td width="200">
								<input type = "text" id="name" name="name">
							</td>		<!-- 세션값에서 가져온다. -->
							
							<th width="150">작성일자</th>
							<td width="150"><input type="date" id="wdate" name="wdate">
							</td>
							
						</tr>
						<tr>
							<th>제 목</th>
							<td colspan="5"><input type="text" id="title" name="title"
								size="100"></td>
						</tr>
						<tr>
							<th>내 용</th>
							<td colspan="5"><textarea rows="6" cols="100" id="subject"
									name="subject">
							
						</textarea></td>
						</tr>
						<tr>
							<th>비  고</th>
							<td colspan="5">
								<input type="text" id="bigo" name="bigo">
							</td>
						</tr>
						
					</table>
				</div>
				<input type="submit" value="저  장">&nbsp;&nbsp;&nbsp;
				<input type="reset" value="취  소">
			</form>
		</div>
		<script type="text/javascript">
				document.getElementById('wdate').value = new Date().toISOString().substring(0, 10);
		</script>
	</div>
</body>
</html>