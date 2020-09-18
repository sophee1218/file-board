package com.file.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.file.board.service.PhotoBoardService;
import com.file.board.vo.PageVO;
import com.file.board.vo.PhotoBoardVO;

@Controller
public class PhotoBoardController {

	@Autowired
	private PhotoBoardService pbService;

	@RequestMapping(value = "/photo/list", method = RequestMethod.GET)
	public String goList(@ModelAttribute PhotoBoardVO pb, Model model) {
		System.out.println(pb);

		pbService.selectPhotoBoardList(pb, model);
		return "photo/list";
	}

	@RequestMapping(value = "/photo/delete", method = RequestMethod.POST)
	public String deletePhotoBoards(@RequestParam("pbNums") int[] pbNums) {
		pbService.deletePhotoBoards(pbNums);
		return "redirect:/photo/list?page.pageNum=1";
	}

	@RequestMapping(value = "/photo/write", method = RequestMethod.GET)
	public String goWrite() {
		return "photo/write";
	}

	@RequestMapping(value = "/photo/view", method = RequestMethod.GET)
	public String doUpdate(@ModelAttribute PhotoBoardVO pb, Model model) {
		return "photo/view";
	}

	@RequestMapping(value = "/photo/write", method = RequestMethod.POST)
	public String doWrite(@ModelAttribute PhotoBoardVO pb, @RequestParam("pbFile") MultipartFile file) {

		pbService.insertPhotoBoard(pb, file);
		return "redirect:/photo/list";
	}

}
