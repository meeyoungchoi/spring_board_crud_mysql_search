package com.spring.mvc.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.spring.mvc.model.BoardVO;

@Repository
public class BoardRepository implements IBoardRepository {
	
	class BoardMapper implements RowMapper<BoardVO> {

		@Override
		public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
			BoardVO board = new BoardVO();
			board.setBoardNo(rs.getInt("board_No"));
			board.setUserId(rs.getString("writer"));
			board.setTitle(rs.getString("title"));
			board.setContent(rs.getString("content"));
			board.setRegDate(rs.getTimestamp("reg_date"));
			board.setViewCnt(rs.getInt("view_cnt"));
			return board;
		}
		
	}
	
	
	
	@Autowired
	private JdbcTemplate template;
	

	@Override
	public void insert(BoardVO board) {
		String sql = "insert into mvc_board "
				+ "(writer, title, content)"
				+ "values(?,?,?)";
		
		template.update(sql, board.getUserId(), board.getTitle(), board.getContent());
		
	}


	@Override
	public List<BoardVO> getBoardList() {
		String sql = "select * from mvc_board";
		return template.query(sql, new BoardMapper());
	}


	@Override
	public BoardVO detail(int boardNo) {
		String sql = "select * from mvc_board "
				+ "where board_No=?";
		return template.queryForObject(sql, new BoardMapper(), boardNo);
	}


	@Override
	public void update(BoardVO board) {
		String sql = "update mvc_board set "
				+ "title=?, content=? "
				+ "where board_No=?";
		
		template.update(sql, board.getTitle(), board.getContent(), board.getBoardNo());
		
	}


	@Override
	public void delete(int boardNo) {
		String sql = "delete from mvc_board "
				+ "where board_No=?";
		template.update(sql, boardNo);
	}


	@Override
	public List<BoardVO> search(String keyword) {
		String sql = "select * from mvc_board "
				+ "where writer LIKE ? ";
		System.out.println("검색완료");
		return template.query(sql, new BoardMapper(), keyword);
	}
	
	
	

}
