package com.board.basic.board.domain.web.board.entity;

import com.board.basic.board.domain.web.board.dto.resp.BoardResponseDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Board {

	private Long id;
	private String title;
	private String content;
	private String author;

	// 게시판 제목
	// 게시판 내용
	// 게시판 작성자

	public BoardResponseDto toDto(){
		return BoardResponseDto.builder()
				.id(id)
				.title(title)
				.content(content)
				.author(author)
				.build();
	}
}
