<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<jsp:include page="/common/head.jsp"></jsp:include>
</head>
<body>
<div class="container">
	<h2>조회하기</h2>

		<form method="POST" action="/photo/view" >
	
	
		번호 : <input type="number" name="pbNum" value="${pb.pbNum}"><br>
		제목 : <input type="text" name="pbTitle" value="${pb.pbTitle}"><br>
		내용 : <input type="text" name="pbContent" value="${pb.pbContent}"><br>
		사진 : <input type="text" name="pbPhotoName" value="${pb.pbPhotoName}"><br>
		파일 : <input type="text" name="pbPhotoPath" value="${pb.pbPhotoPath}"><br>

			<button>수정</button>
			<button>취소</button>
		</form>
		
</div>
</body>
</html>