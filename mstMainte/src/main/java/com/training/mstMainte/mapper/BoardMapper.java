package com.training.mstMainte.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.training.mstMainte.entity.BoardVO;


@Mapper
public interface BoardMapper {
	public List<BoardVO> BoardSelect();//상품 검색
	public int BoardInsert(BoardVO boardVO);//상품 작성
	public int BoardUpdate(BoardVO boardVO);//상품 편집
	public int BoardDelete(BoardVO boardVO);//상품 삭제
	public List<BoardVO> BoardSearch(String keyword);//상품검색
	
	public BoardVO BoardData(BoardVO boardVO);//보드 값
	
	public int GoodsNumberCheck(String goods_number);
	
	public List<BoardVO> boardSelect_Dress(BoardVO boardVO);
	public List<BoardVO> boardSelect_Eat(BoardVO boardVO);
	public List<BoardVO> boardSelect_ETC(BoardVO boardVO);
}
