package com.spring.mvc.model;

import java.util.Date;

public class BoardVO {
	private int boardNo;
	private Date regDate;
	private String userId;
	private String title;
	private String content;
	private int viewCnt;
	
	
	
	
	public int getBoardNo() {
		return boardNo;
	}
	
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getViewCnt() {
		return viewCnt;
	}
	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}

	@Override
	public String toString() {
		return "BoardVO [boardNo=" + boardNo + ", regDate=" + regDate + ", userId=" + userId + ", title=" + title
				+ ", content=" + content + ", viewCnt=" + viewCnt + "]";
	}
	

}
