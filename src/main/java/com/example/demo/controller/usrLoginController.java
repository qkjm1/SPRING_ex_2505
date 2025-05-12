package com.example.demo.controller;

import jakarta.servlet.http.HttpSession;

public class usrLoginController{
	
	
	public static int loginInt(HttpSession session) {
		boolean isLogined = false;
		int loginedMemberId = 0;
		
		if (session.getAttribute("loginedMemberId") != null) {
			isLogined = true;
			loginedMemberId = (int) session.getAttribute("loginedMemberId");
		}
		
		return loginedMemberId;
	}
	
	public static boolean loginBool(HttpSession session) {
		boolean isLogined = false;
		int loginedMemberId = 0;
		
		if (session.getAttribute("loginedMemberId") != null) {
			isLogined = true;
			loginedMemberId = (int) session.getAttribute("loginedMemberId");
		}
		
		return isLogined;
	}
	
	
	
}
