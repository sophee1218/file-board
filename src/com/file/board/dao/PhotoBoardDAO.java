package com.file.board.dao;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.file.board.vo.PhotoBoardVO;

public interface PhotoBoardDAO {

	int insertPhotoBoard(PhotoBoardVO pb, MultipartFile file);
	List<PhotoBoardVO> selectPhotoBoardList(PhotoBoardVO pb);
	int selectPhotoBoardCount(PhotoBoardVO pb);
	int deletePhotoBoards(int[] pbNums);
	List<PhotoBoardVO> selectPhotoBoardsForDelete(int[] pbNums);
	int updatePhotoBoard(PhotoBoardVO pb, MultipartFile file);
}
