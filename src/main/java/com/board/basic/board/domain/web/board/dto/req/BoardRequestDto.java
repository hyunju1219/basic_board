package com.board.basic.board.domain.web.board.dto.req;

public record BoardRequestDto(

        String title,
        String content,
        String writer,
        String createDate
) {
}
