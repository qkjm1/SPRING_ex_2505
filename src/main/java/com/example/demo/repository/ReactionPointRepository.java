package com.example.demo.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.vo.ResultData;

@Mapper
public interface ReactionPointRepository {

	int getSumReactionPoint(int loginedMemberId, String relTypeCode, int relId);

	int increaseReactionPoint(int loginedMemberId, String relTypeCode, int relId);

	ResultData discreaseReactionPoint(int loginedMemberId, String relTypeCode, int relId);

	ResultData upDateReaction(int loginedMemberId, String relTypeCode, int relId, int usersReaction);

}
