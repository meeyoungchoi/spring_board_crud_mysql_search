<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>검색 결과</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div class="jumbotron">
			<h1>검색 결과</h1>
		</div>
	</div>
	
	<div class="container">
		<table class="table">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">writer</th>
      <th scope="col">title</th>
      <th scope="col">content</th>
    </tr>
  </thead>
  <tbody>
    
    <c:forEach var="board" items="boards">
     <tr>
				     
				      <td>${board.userId}</td>
				      <td>${board.title}</td>
				      <td>${board.content}</td>
				      <td>
				      	<fmt:formatDate value="${board.regDate}" pattern="yyyy년  MM월 dd일 a hh:mm"/>
				      </td>
				     
	 </tr>
    
    </c:forEach>
    
  </tbody>
</table>
	
	</div>
	
	
</body>
</html>