<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 목록</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div class="jumbotron">
			<h1>글 목록</h1>
			<a class="btn btn-primary" href="/mvc/board/write">추가하기</a>
		</div>
	</div>
	
	<div class="container">
		<table class="table">
			  <thead>
			    <tr>
			      <th>#</th>
			      <th>writer</th>
			      <th>title</th>
			      <th>date</th>
			    </tr>
			  </thead>
			  <tbody>
		
			  <c:forEach var="b" items="${boards}">
			  	  <tr>
				      <td>${b.boardNo}</td>
				      <td>${b.userId}</td>
				      <td>
				      	<a href="/mvc/board/show?boardNo=${b.boardNo}">
				      		${b.title}
				      	</a>
				      
				      </td>
				      <td>
				      	<fmt:formatDate value="${b.regDate}" pattern="yyyy년  MM월 dd일 a hh:mm"/>
				      </td>
				      <td>
				      	<a href="/mvc/board/delete?boardNo=${b.boardNo}" class="btn btn-danger">삭제</a>
				      </td>
			     </tr>
			  </c:forEach>	
			  
			  </tbody>
		</table>
		
		
		<form class="form-inline" method="post" action="/mvc/board/search">
		  <div class="form-group mx-sm-3 mb-2">
		    <label for="inputPassword2" class="sr-only"></label>
		    <input type="text" class="form-control" name="keyword"  placeholder="검색어를 입력하세요">
		  </div>
		  <button type="submit" class="btn btn-primary mb-2">검색</button>
		</form>
		
	</div>
	
	
</body>
</html>