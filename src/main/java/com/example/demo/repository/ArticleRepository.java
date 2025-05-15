package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.vo.Article;

@Mapper
public interface ArticleRepository {

	public int writeArticle(int memberId, String title, String body);

	public void deleteArticle(int id);

	public void modifyArticle(int id, String title, String body);

	public int getLastInsertId();

	public Article getArticleById(int id);

	public List<Article> getArticles();
	
	public Article getForPrintArticle(int loginedMemberId);
	
	public List<Article> getArticlesByBdId(int boardId);
	
	public List<Article> getPrintArticlesByBdId(int boardId, int limitFrom, int itemsInAPage);

	public int getBdPageCnt(int boardId);

	public Article getWriter(int loginedMemberId);

	public int getArticleCount(int boardId, String searchKeywordTypeCode, String searchKeyword);

	public List<Article> getForPrintArticles(int boardId, int limitFrom, int limitTake, String searchKeywordTypeCode, String searchKeyword);

}
