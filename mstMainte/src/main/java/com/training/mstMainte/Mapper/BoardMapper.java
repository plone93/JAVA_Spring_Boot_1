package com.training.mstMainte.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.training.mstMainte.Entity.BoardVO;


@Mapper
public interface BoardMapper {
	public List<BoardVO> BoardSelect();//상품 검색
	public int BoardInsert(BoardVO boardVO);//상품 작성
	public int BoardUpdate(BoardVO boardVO);//상품 편집
	public int BoardDelete(BoardVO boardVO);//상품 삭제
	
	public BoardVO BoardData(BoardVO boardVO);//보드 값
}
