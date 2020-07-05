<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 수정</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div class="jumbotron">
			<h1>게시물 수정</h1>
		</div>	
	</div>
	
	
	<div class="container">
		<form method="post" action="/mvc/board/update">
			<div class="form-group row">
				<label class="col-sm-2">작성일</label>
				<div class="col-sm-10">
					<fmt:formatDate value="${board.regDate}" pattern="yyyy년  MM월 dd일 a hh:mm"/>
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">작성자</label>
				<div class="col-sm-10">
					<input type="text" name="userId" value="${board.userId}" class="form-control">
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">글번호</label>
				<div class="col-sm-10">
					<input type="text" name="boardNo" value="${board.boardNo}" class="form-control">
				</div>
			</div>
			
			<div class="form-group row">
				<label class="col-sm-2">제목</label>
				<div class="col-sm-10">
					<input type="text" name="title" value="${board.title}" class="form-control">
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">내용</label>
				<div class="col-sm-10">
					<input type="text" name="content" value="${board.content}" class="form-control">
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">조회수</label>
				<div class="col-sm-10">
					<input type="text" name="viewCnt" value="${board.viewCnt}" class="form-control">
				</div>
			</div>
			<div class="form-action">
				<button class="btn btn-primary">제출</button>
			</div>
		</form>
	</div>
</body>
</html>