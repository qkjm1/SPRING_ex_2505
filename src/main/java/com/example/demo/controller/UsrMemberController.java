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
	public Object doJoin(String loginId, String loginPw) {

		int loginIdul = (int) memberService.getIntMemberId(loginId);
		
		if (loginIdul == 1) {
			return "아이디 중복";
		}

		Member member = memberService.doJoin(loginId, loginPw);
		String sd = member.getLoginPw();
		
		return "회원 정보:"+member+"회원 비밀번호:"+sd;
	}


}
