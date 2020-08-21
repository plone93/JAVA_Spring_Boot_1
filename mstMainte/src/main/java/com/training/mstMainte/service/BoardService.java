package com.training.mstMainte.service;

import java.util.List;

import com.training.mstMainte.entity.BoardVO;


public interface BoardService {
	public List<BoardVO> BoardSelect();//상품 검색
	public int BoardInsert(BoardVO boardVO);//상품 작성
	public int BoardUpdate(BoardVO boardVO);//상품 편집
	public int BoardDelete(BoardVO boardVO);//상품 삭제
	public BoardVO BoardView(BoardVO boardVO);//상품 상세 보기
	public List<BoardVO> BoardSearch(String keyword);//상품검색
	
	public BoardVO BoardData(BoardVO boardVO);//보드 값
	
	public int GoodsNumberCheck(String goods_number);//상품번호 중복확인 체크
	
	public List<BoardVO> boardSelect_Dress(BoardVO boardVO);
	public List<BoardVO> boardSelect_Eat(BoardVO boardVO);
	public List<BoardVO> boardSelect_ETC(BoardVO boardVO);

}
