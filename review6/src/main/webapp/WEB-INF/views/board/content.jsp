﻿<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    

<jsp:include page="../include/header.jsp" />
<style>
header.masthead {
	
	display: none;
}	
</style>
<br/><br/>
<div class="container">

<div class="row">
  <div class="col-lg-12">
    <div class="card">
      <div class="card-header text-white" style="background-color: #643691;">${board.boardNo}번 게시물 내용</div>
      <div class="card-body">

        <form role="form" action="#" method="post">
        
          <div class="form-group">
            <label>작성자</label>
            <input type="text" class="form-control" name='writer' value="${board.writer}" readonly>
          </div>
          
          <div class="form-group">
            <label>제목</label>
            <input type="text" class="form-control" name='title' value="${board.title}" readonly>
          </div>

          <div class="form-group">
            <label>내용</label>
            <textarea class="form-control" rows="5" name='content' readonly>${board.content}</textarea>
          </div>

         
          <a class="btn" href="<c:url value='/board/list'/>"
		style="background-color: #643691; margin-top: 0; height: 40px; color: white; border: 0px solid #388E3C; opacity: 0.8">목록</a>&nbsp;&nbsp;
          <a class="btn" href="<c:url value='/board/modify/${board.boardNo}'/>"
		style="background-color: orange; margin-top: 0; height: 40px; color: white; border: 0px solid #388E3C; opacity: 0.8">수정</a>&nbsp;&nbsp;
          <a class="btn btn-danger" href="<c:url value='/board/delete/${board.boardNo}'/>" onclick="return confirm('정말로 삭제하시겠습니까?')"
		style="background-color: red; margin-top: 0; height: 40px; color: white; border: 0px solid #388E3C; opacity: 0.8">삭제</a>&nbsp;&nbsp;
        </form>



      </div>
    </div>
  </div>
</div>
</div>
<jsp:include page="../include/footer.jsp" />