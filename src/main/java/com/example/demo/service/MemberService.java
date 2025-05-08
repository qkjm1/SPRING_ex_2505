package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ArticleRepository;
import com.example.demo.repository.MemberRepository;
import com.example.demo.vo.Article;
import com.example.demo.vo.Member;

@Service
public class MemberService {

	@Autowired
	private MemberRepository memberRepository;

	public MemberService(MemberRepository memberRepository) {
		this.memberRepository = memberRepository;
		testData();
		
	}
	
	public void testData() {
		
		for(int i = 4;i < 10;i++) {
			doJoin("test"+i,"test"+i);
		}
		
	}



	public Member doJoin(String loginId, String loginPw) {
		memberRepository.doJoin(loginId, loginPw);
		return new Member(loginId, loginPw);
	}
	
	public int getIntMemberId(String loginId) {
		return memberRepository.getIntMemberId(loginId);
	}



}
