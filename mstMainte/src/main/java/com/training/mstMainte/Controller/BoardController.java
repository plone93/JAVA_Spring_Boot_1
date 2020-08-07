package com.training.mstMainte.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.training.mstMainte.Entity.BoardVO;
import com.training.mstMainte.Service.BoardService;


@Controller
public class BoardController {
	
	@Autowired
	private BoardService board;
	
	
	@RequestMapping(value = "/Board/BoardList", method = RequestMethod.GET)
	public String BoardList(BoardVO boardVO,
							Model model) {
		String url = "/Board/BoardList";
		
		List<BoardVO> boardList = board.BoardSelect();
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println(boardList);
		model.addAttribute("boardList", boardList);
		
		return url;
	}
	
	/*作成*/
	@RequestMapping(value = "/Board/BoardInsert", method = RequestMethod.GET)
	public String BoardInsert() {
		String url = "Board/BoardInsert";
		
		return url;
	}
	
	@RequestMapping(value = "/Board/BoardInsert", method = RequestMethod.POST)
	public String BoardInserted(BoardVO boardVO) {
		String url = "redirect:/Board/BoardList"; // BoardList메서드 실행
		
		return url;
	}
	
	/*編集*/
	@RequestMapping(value = "/Board/BoardUpdate", method = RequestMethod.GET)
	public String BoardUpdate(BoardVO boardVO,
							  Model model) {
		String url = "Board/BoardUpdate";
		
		boardVO = board.BoardData(boardVO);
		model.addAttribute("boardVO", boardVO);
		
		return url;
	}
	
	@RequestMapping(value = "/Board/BoardUpdated", method = RequestMethod.POST)
	public String BoardUpdated(BoardVO boardVO) {
		String url = "redirect:/Board/BoardList"; // BoardList메서드 실행
		
		return url;
	}
	
	/*削除*/
	@RequestMapping(value = "/Board/BoardDelete", method = RequestMethod.GET)
	public String BoardDelete() {
		String url = "redirect:/Board/BoardList"; // BoardList메서드 실행
		
		return url;
	}
}
