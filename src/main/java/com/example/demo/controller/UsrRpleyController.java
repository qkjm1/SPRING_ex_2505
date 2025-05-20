package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.service.MemberService;
import com.example.demo.service.ReactionPointService;
import com.example.demo.service.RpleyService;
import com.example.demo.util.Ut;
import com.example.demo.vo.Member;
import com.example.demo.vo.ResultData;
import com.example.demo.vo.Rq;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class UsrRpleyController {

	@Autowired
	private Rq rq;

	@Autowired
	private RpleyService rpleyService;

	@RequestMapping("/usr/rpley/doReplyAction")
	@ResponseBody
	public String doReplyAction(HttpServletRequest req, int id , String msg) {
		
		System.err.println(msg);
		System.err.println(rq.getLoginedMemberId());
		System.err.println(id);
		
		ResultData rd = rpleyService.addReply(rq.getLoginedMemberId(), id, msg);
		
		System.err.println("=============rpleyService==============");
		
		return Ut.jsReplace(rd.getResultCode(), rd.getMsg(), "../article/detail?id="+id);
	}
	
	@RequestMapping("/usr/rpley/showReply")
	@ResponseBody
	public String showReply(HttpServletRequest req, int id , String msg) {
		
		System.err.println(msg);
		System.err.println(rq.getLoginedMemberId());
		System.err.println(id);
		
		ResultData rd = rpleyService.addReply(rq.getLoginedMemberId(), id, msg);
		
		System.err.println("=============rpleyService==============");
		
		return Ut.jsReplace(rd.getResultCode(), rd.getMsg(), "../article/detail?id="+id);
	}

}