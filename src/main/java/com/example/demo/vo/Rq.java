package com.example.demo.vo;

import com.sun.net.httpserver.HttpsServer;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.Getter;

public class Rq{
	
	@Getter
	private int loginedMemberId;
	@Getter
	private boolean isLogined;
	
	public Rq(HttpServletRequest req) {
		HttpSession session = req.getSession();
		
		if (session.getAttribute("loginedMemberId") != null) {
			isLogined = true;
			loginedMemberId = (int) session.getAttribute("loginedMemberId");
		}
		
	}
	
	
	
}
