package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.service.MemberService;
import com.example.demo.vo.Member;

@Controller
public class UsrMemberController {

	@Autowired
	private MemberService memberService;

	// 액션메서드

	@RequestMapping("/usr/member/doJoin")
	@ResponseBody
	public Object doJoin(String loginId, String loginPw, String name) {

		int loginIdul = (int) memberService.getIntMemberId(loginId);
		
		if (loginIdul == 1) {
			return "아이디 중복";
		}

		memberService.doJoin(loginId, loginPw, name);
		
		Member member = memberService.getMemberById(loginIdul);
	
		
		return "회원 정보:"+member;
	}


}
