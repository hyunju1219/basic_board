package com.board.basic.board.domain.web.board.dto.resp;

import com.board.basic.board.domain.web.board.entity.Board;
import lombok.Builder;

import java.util.List;

@Builder
public record BoardResponseDto(
        Long id,
        String title,
        String content,
        String author
) {
}
