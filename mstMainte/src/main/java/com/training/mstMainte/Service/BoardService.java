package com.training.mstMainte.Service;

import java.util.List;

import com.training.mstMainte.Entity.BoardVO;


public interface BoardService {
	public List<BoardVO> BoardSelect();//상품 검색
	public int BoardInsert(BoardVO boardVO);//상품 작성
	public int BoardUpdate(BoardVO boardVO);//상품 편집
	public int BoardDelete(BoardVO boardVO);//상품 삭제
	public BoardVO BoardView(BoardVO boardVO);//상품 상세 보기
	
	public BoardVO BoardData(BoardVO boardVO);//보드 값

}
