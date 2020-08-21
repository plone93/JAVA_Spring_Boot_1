package com.training.mstMainte.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.mstMainte.entity.BoardVO;
import com.training.mstMainte.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	BoardMapper board;

	@Override
	public List<BoardVO> BoardSelect() {
	//	HashMap<String, Object> map = new HashMap<String, Object>();
		return board.BoardSelect();
	}

	@Override
	public int BoardInsert(BoardVO boardVO) {
		return board.BoardInsert(boardVO);
	}

	@Override
	public int BoardUpdate(BoardVO boardVO) {
		return board.BoardUpdate(boardVO);
	}

	@Override
	public int BoardDelete(BoardVO boardVO) {
		return board.BoardDelete(boardVO);
	}

	@Override
	public BoardVO BoardData(BoardVO boardVO) {
		return board.BoardData(boardVO);
	}

	@Override
	public BoardVO BoardView(BoardVO boardVO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int GoodsNumberCheck(String goods_number) {
		return board.GoodsNumberCheck(goods_number);
	}

	@Override
	public List<BoardVO> BoardSearch(String keyword) {
		return board.BoardSearch(keyword);
	}

	@Override
	public List<BoardVO> boardSelect_Dress(BoardVO boardVO) {
		return board.boardSelect_Dress(boardVO);
	}

	@Override
	public List<BoardVO> boardSelect_Eat(BoardVO boardVO) {
		return board.boardSelect_Eat(boardVO);
	}

	@Override
	public List<BoardVO> boardSelect_ETC(BoardVO boardVO) {
		return board.boardSelect_ETC(boardVO);
	}

}
