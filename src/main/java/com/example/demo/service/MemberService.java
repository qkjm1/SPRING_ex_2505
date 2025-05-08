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
	}
	
	public Member doJoin(String loginId, String loginPw, String name) {
		memberRepository.doJoin(loginId, loginPw, name);
		return new Member(loginId, loginPw, name);
	}
	
	public int getIntMemberId(String loginId) {
		return memberRepository.getIntMemberId(loginId);
	}
	
	public Member getMemberById(int id) {
		return memberRepository.getMemberById(id);
	}



}
