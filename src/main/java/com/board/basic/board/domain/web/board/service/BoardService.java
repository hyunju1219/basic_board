package com.board.basic.board.domain.web.board.service;

import com.board.basic.board.domain.web.board.dto.req.BoardRequestDto;
import com.board.basic.board.domain.web.board.dto.resp.BoardResponseDto;
import com.board.basic.board.domain.web.board.entity.Board;
import com.board.basic.board.domain.web.board.entity.repository.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    private BoardMapper boardMapper;

	// 게시판 목록 조회
    public List<BoardResponseDto> getBoards() {
        List<Board> boards = boardMapper.findAllBoard();
        return boards.stream().map(Board::toDto).toList();
    }
	// 게시판 상세 조회
    public BoardResponseDto getBoard(Long boardId) {
        return boardMapper.findBoardById(boardId).toDto();
    }

	// 게시판 등록
    public void addBoard(BoardRequestDto dto) {
        boardMapper.save(dto.toEntity());
    }
	// 게시판 수정
    public void updateBoard(BoardRequestDto dto) {
        boardMapper.updateBoard(dto.toEntity());
    }
	// 게시판 삭제
    public void deleteBoard(Long boardId) {
        boardMapper.deleteBoardById(boardId);
    }
}
