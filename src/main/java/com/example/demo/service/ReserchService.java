package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ArticleRepository;
import com.example.demo.repository.BoardRepository;
import com.example.demo.repository.ReserchRepository;
import com.example.demo.util.Ut;
import com.example.demo.vo.Article;
import com.example.demo.vo.Board;

@Service
public class ReserchService {
	
	@Autowired
	private ReserchRepository reserchRepository;

	public List<Article> articleReserchType(String keyword, String keywordType ) {		
		return reserchRepository.articleReerchType(keyword, keywordType);
	}
	

}