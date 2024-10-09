package com.board.basic.board.domain.web.board.dto.req;

import com.board.basic.board.domain.web.board.entity.Board;

public record BoardRequestDto(
        String title,
        String content,
        String author
) {
    public Board toEntity() {
        return Board.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }
}
