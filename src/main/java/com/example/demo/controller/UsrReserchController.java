package com.example.demo.controller;

import java.util.List;

import org.apache.tomcat.util.buf.Utf8Encoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.demo.DemoApplication;
import com.example.demo.service.ArticleService;
import com.example.demo.service.BoardService;
import com.example.demo.service.MemberService;
import com.example.demo.service.ReserchService;
import com.example.demo.util.Ut;
import com.example.demo.vo.Article;
import com.example.demo.vo.Board;
import com.example.demo.vo.ResultData;
import com.example.demo.vo.Rq;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class UsrReserchController {

    private final DemoApplication demoApplication;
	
	@Autowired
	private Rq rq;

	@Autowired
	private ReserchService reserchService;
	
	@Autowired
	private ArticleService articleService;
	
	@Autowired
	private BoardService boardService;

    UsrReserchController(DemoApplication demoApplication) {
        this.demoApplication = demoApplication;
    }

	// 로그인 체크 -> 유무 체크 -> 권한체크
    
	
	@RequestMapping("/usr/article/doReserch")
	public String showModify(HttpServletRequest req, String keyword) {
		
		
		
		return null;
	}
	
	
}