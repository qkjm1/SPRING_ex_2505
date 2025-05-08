package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.vo.Article;
import com.example.demo.vo.Member;

@Mapper
public interface MemberRepository {

	@Insert ("INSERT INTO `member` SET regDate = NOW(), loginId = #{loginId}, loginPw =#{loginPw}, `name` = #{name}")
	void doJoin(String loginId, String loginPw, String name);
	
	@Select ("SELECT COUNT(*) FROM `member` WHERE loginId = #{loginId}")
	int getIntMemberId(String loginId);

	@Select ("SELECT * FROM `member` WHERE loginId = #{loginId}")
	Member getMemberById(int id);

}
