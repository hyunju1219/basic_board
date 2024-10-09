package com.board.basic.board.domain.web.board.controller;

import com.board.basic.board.domain.web.board.dto.req.BoardRequestDto;
import com.board.basic.board.domain.web.board.entity.Board;
import com.board.basic.board.domain.web.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/basic")
public class BoardController {
    @Autowired
    private BoardService boardService;

	// 게시판 목록 조회

	// 게시판 상세 조회

	// 게시판 등록
    @PostMapping("/board")
    public ResponseEntity<?> addBoard(BoardRequestDto dto) {
        System.out.println("요청들어옴");
        System.out.println(dto);
        boardService.addBoard(dto);
        return ResponseEntity.ok().body(null);
    }
	// 게시판 수정

	// 게시판 삭제


}
