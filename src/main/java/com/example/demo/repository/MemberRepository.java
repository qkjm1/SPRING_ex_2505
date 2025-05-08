package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.vo.Article;

@Mapper
public interface MemberRepository {

	@Insert ("INSERT INTO `member` SET regDate = NOW(), updateDate = NOW(), loginId = #{loginId}, loginPw =#{loginPw}")
	void doJoin(String loginId, String loginPw);
	
	@Select ("SELECT COUNT(*) `member` WHERE loginId = #{loginId}")
	int getIntMemberId(String loginId);



}
