package com.board.basic.board.domain.web.board.controller;

import com.board.basic.board.domain.web.board.dto.req.BoardRequestDto;
import com.board.basic.board.domain.web.board.entity.Board;
import com.board.basic.board.domain.web.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/basic")
public class BoardController {
    @Autowired
    private BoardService boardService;

	// 게시판 목록 조회
    @GetMapping("/boards")
    public ResponseEntity<?> getBoards() {
        System.out.println(boardService.getBoards());
        return ResponseEntity.ok().body(null);
    }

	// 게시판 상세 조회
    @GetMapping("/board/{boardId}")
    public ResponseEntity<?> getBoard(Long boardId) {
        System.out.println(boardId);
        return ResponseEntity.ok().body(boardService.getBoard(boardId));
    }

	// 게시판 등록
    @PostMapping("/board")
    public ResponseEntity<?> addBoard(BoardRequestDto dto) {
        boardService.addBoard(dto);
        return ResponseEntity.ok().body(null);
    }
	// 게시판 수정
    @PutMapping("/board/{boardId}")
    public ResponseEntity<?> updateBoard(BoardRequestDto dto) {
        boardService.updateBoard(dto);
        return ResponseEntity.ok().body(null);
    }
	// 게시판 삭제
   @DeleteMapping("/board/{boardId}")
    public ResponseEntity<?> deleteBoard(Long boardId) {
        boardService.deleteBoard(boardId);
        return ResponseEntity.ok().body(null);
   }

}
