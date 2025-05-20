package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ArticleRepository;
import com.example.demo.repository.BoardRepository;
import com.example.demo.repository.RepleyRepository;
import com.example.demo.util.Ut;
import com.example.demo.vo.Article;
import com.example.demo.vo.Board;
import com.example.demo.vo.Reply;
import com.example.demo.vo.ResultData;

@Service
public class RpleyService {
	
	@Autowired
	private RepleyRepository rpleyRepository;

	public ResultData addReply(int loginedMemberId, int id, String msg) {
		
		System.err.println("=====pository=====");

		rpleyRepository.addReply(loginedMemberId,id,msg);
		
		return ResultData.from("S-1", "댓글 추가");
	}

	public List<Reply> listReply(int id) {
		return rpleyRepository.listReply(id);
	}
	

}