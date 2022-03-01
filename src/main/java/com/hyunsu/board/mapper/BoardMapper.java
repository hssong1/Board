package com.hyunsu.board.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hyunsu.board.model.Board;

@Repository
public interface BoardMapper {
	
	public String now() throws Exception;
	
	public List<Board> boardList() throws Exception;
}


