package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.vo.Article;
import com.example.demo.vo.ChatMsg;
import com.example.demo.vo.ResultData;

@Mapper
public interface RepleyRepository {

	public int addReply(int memberId, int articleId, String reMsg);

	public List<ChatMsg> listReply(int articleId);


}
