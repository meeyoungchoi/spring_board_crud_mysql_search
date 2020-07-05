<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 작성</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div class="jumbotron">
			<h1>게시글 작성</h1>
		</div>
	</div>	

	<div class="container">
		<form method="post" action="/mvc/board/write">
			<div class="form-group row">
				<label class="col-sm-2 col-form-label">작성자</label>
				<div class="col-sm-10">
					<input type="text" name="userId" class="form-control">
				</div>
			</div>
		    <div class="form-group row">
				<label class="col-sm-2 col-form-label">제목</label>
				<div class="col-sm-10">
					<input type="text" name="title" class="form-control">
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2 col-form-label">내용</label>
				<div class="col-sm-10">
					<input type="text" name="content" class="form-control">
				</div>
			</div>
			<div class="form-action">
				<button class="btn btn-primary">저장</button>
			</div>
		</form>
	
	</div>
	
	
	
</body>
</html>