package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.vo.ChatMsg;
import com.example.demo.vo.ResultData;


@Controller
@RequestMapping("/chat")
public class ChatController {

	private ChatMsg msg = new ChatMsg("홍기동", "어ㅉ떠구");
	
	
    @GetMapping("/writeMessage")
    @ResponseBody
    public ResultData writeMessage(@RequestParam("message") String message) {
        return ResultData.from("S-1", "메세지작성", "msg정보" ,msg );
    }
}