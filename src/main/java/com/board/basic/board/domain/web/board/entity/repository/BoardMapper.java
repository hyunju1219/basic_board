package com.board.basic.board.domain.web.board.entity.repository;

import com.board.basic.board.domain.web.board.entity.Board;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {
    int save(Board board);
}
