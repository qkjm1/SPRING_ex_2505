package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.service.ArticleService;
import com.example.demo.util.Ut;
import com.example.demo.vo.Article;
import com.example.demo.vo.Likes;
import com.example.demo.vo.ResultData;
import com.example.demo.vo.Rq;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;


@Controller
public class UsrHeartController {
	
	@Autowired
	private ArticleService articleService;
	
	@RequestMapping("/usr/article/doIncHeartCountRd")
	public String doIncHeartCountRd(HttpServletRequest req, int articleId , int memberId) {
		
		Rq rq = (Rq) req.getAttribute("rq");

		Likes like = articleService.likeCnt(articleId, memberId);
		
		return "/usr/home/main";
	}


}