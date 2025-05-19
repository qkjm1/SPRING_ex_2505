package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.service.MemberService;
import com.example.demo.service.ReactionPointService;
import com.example.demo.util.Ut;
import com.example.demo.vo.Member;
import com.example.demo.vo.ResultData;
import com.example.demo.vo.Rq;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class UsrReactionPointController {

	private final UsrArticleController usrArticleController;

	@Autowired
	private Rq rq;

	@Autowired
	private ReactionPointService reactionPointService;

	UsrReactionPointController(UsrArticleController usrArticleController) {
		this.usrArticleController = usrArticleController;
	}
	
	
	

	@RequestMapping("/usr/reactionPoint/doGoodReaction")
	public Object doGoodReaction(HttpServletRequest req, String relTypeCode, int relId, String replaceUri) {

	ResultData usersReactionRd = reactionPointService.usersReaction(rq.getLoginedMemberId(), relTypeCode, relId);
		
		int usersReaction = (int)usersReactionRd.getData1();
	
		if (usersReaction == 1) {
			ResultData rd = reactionPointService.deleteGoodReactionPoint(rq.getLoginedMemberId(), relTypeCode, relId);
			
		}
		if (usersReaction == -1) {
			ResultData resultData =  reactionPointService.upDateReaction(rq.getLoginedMemberId(), relTypeCode, relId, usersReaction);
			return Ut.f("s-1", "싫어요 변환");
		}

		ResultData reactionRd = reactionPointService.increaseReactionPoint(rq.getLoginedMemberId(), relTypeCode, relId);

		return Ut.jsReplace(reactionRd.getResultCode(), reactionRd.getMsg(), replaceUri);
	}
	
	
	
	
	@RequestMapping("/usr/reactionPoint/doBadReaction")
	public String doBadReaction(HttpServletRequest req, String relTypeCode, int relId, String replaceUri) {

		int usersReaction = reactionPointService.userCanReaction(rq.getLoginedMemberId(), relTypeCode, relId);

		if (usersReaction == -1) {
			return Ut.f("F-1", "이미 함");
		}
		
		if (usersReaction == 1) {	
			ResultData resultData =  reactionPointService.upDateReaction(rq.getLoginedMemberId(), relTypeCode, relId, usersReaction);		
			return Ut.f("S-1", "좋아요 > 싫어요 혹은 싫어요");
		}
		
		return Ut.f("S-1","좋아요 > 싫어요 ", replaceUri);
	}
	
	
	
	
	
	public String reactionJoinUp(HttpServletRequest req, String relTypeCode, int relId, String replaceUri) {

		int usersReaction = reactionPointService.userCanReaction(rq.getLoginedMemberId(), relTypeCode, relId);

		if (usersReaction == 1) {
			return Ut.jsHistoryBack("F-1", "이미 함");
		}

		ResultData reactionRd = reactionPointService.increaseReactionPoint(rq.getLoginedMemberId(), relTypeCode, relId);

		return Ut.jsReplace(reactionRd.getResultCode(), reactionRd.getMsg(), replaceUri);
	}

}