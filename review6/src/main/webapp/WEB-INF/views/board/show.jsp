<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 상세보기</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div class="jumbotron">
			<h1>글 상세조회</h1>
		</div>
	</div>
	
	<div class="container">
		<div class="form-group row">
			<label class="col-sm-2">작성일</label>
			<div class="col-sm-10">
				<fmt:formatDate value="${board.regDate}" pattern="yyyy년  MM월 dd일 a hh:mm" />
			</div>
		</div>
		<div class="form-group row">
			<label class="col-sm-2">작성자</label>
			<div class="col-sm-10">
				<input type="text" readonly="readonly" name="userId" value="${board.userId}" class="form-control">
			</div>
		</div>
		<div class="form-group row">
			<label class="col-sm-2">제목</label>
			<div class="col-sm-10">
				<input type="text" readonly="readonly" name="title" value="${board.title}" class="form-control">
			</div>
		</div>
		<div class="form-group row">
			<label class="col-sm-2">내용</label>
			<div class="col-sm-10">
				<input type="text" readonly="readonly" name="content" value="${board.content}" class="form-control">
			</div>
		</div>
		<div class="form-group row">
			<label class="col-sm-2">조회수</label>
			<div class="col-sm-10">
				<input type="text" readonly="readonly" name="viewCnt" value="${board.viewCnt + 1}" class="form-control">
			</div>
		</div>
		
			<a class="btn btn-primary" href="/mvc/board/list">목록</a>
			<a class="btn btn-info" href="/mvc/board/edit?boardNo=${board.boardNo}">수정</a>
	</div>
	

</body>
</html>