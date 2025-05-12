package com.example.demo.vo;

import jakarta.servlet.http.HttpSession;

public class usrLoginController{
	
	
	public static int loginInt(HttpSession session) {
		int loginedMemberId = 0;
		
		if (session.getAttribute("loginedMemberId") != null) {
			loginedMemberId = (int) session.getAttribute("loginedMemberId");
		}
		
		return loginedMemberId;
	}
	
	public static boolean loginBool(HttpSession session) {
		boolean isLogined = false;
		
		if (session.getAttribute("loginedMemberId") != null) {
			isLogined = true;
		}
		
		return isLogined;
	}
	
	
	
}
