package com.spring.mvc.db.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.mvc.model.BoardVO;
import com.spring.mvc.repository.IBoardMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/mvc-config.xml"})
public class BoardMapperTest {
	
	
	@Autowired
	private IBoardMapper mapper;
	
	
	//게시글 등록 단위 테스트
	@Test
	public void insertTest() {
		
		for(int i=1; i<=320; i++) {
			BoardVO article = new BoardVO();
			article.setTitle("테스트 제목입니다." + i);
			article.setWriter("김테스트" + i);
			article.setContent("테스트 중이니까 말시키지 마세요~" + i);
			mapper.insert(article);
		}
		System.out.println("게시물 등록 성공!");
	}
	
	@Test
	public void getListTest() {
		List<BoardVO> list = mapper.getBoardList();
		
		for (BoardVO vo : list) {
			System.out.println(vo);
		}
	}
	
	
	@Test
	public void updateTest() {
		BoardVO article = new BoardVO();
		article.setBoardNo(2);
		article.setTitle("수정된 제목");
		article.setContent("수정된 내용");
		mapper.update(article);
		System.out.println("수정 후 정보: " + mapper.detail(2));
		
	}
	
	@Test
	public void deleteTest() {
		mapper.delete(3);
		BoardVO vo = mapper.detail(3);
		if (vo == null) {
			System.out.println("게시시물 없음");
		} else {
			System.out.println("게시물 정보: " + vo);
		}
	}
	
	
	
	
}
