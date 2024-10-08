package com.board.basic.board.domain.web.board.service;

import com.board.basic.board.domain.web.board.dto.req.BoardRequestDto;
import com.board.basic.board.domain.web.board.entity.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

	// 게시판 목록 조회

	// 게시판 상세 조회

	// 게시판 등록
    public void addBoard(BoardRequestDto dto) {

    }
	// 게시판 수정

	// 게시판 삭제
}
