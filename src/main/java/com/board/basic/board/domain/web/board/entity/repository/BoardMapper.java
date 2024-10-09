package com.board.basic.board.domain.web.board.entity.repository;

import com.board.basic.board.domain.web.board.entity.Board;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    int save(Board board);
    Board findBoardById(Long id);
    int deleteBoardById(Long id);
    int updateBoard(Board board);
    List<Board> findAllBoard();

}
