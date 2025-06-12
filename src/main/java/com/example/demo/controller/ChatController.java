package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.vo.ChatMsg; 
import com.example.demo.vo.RsData;


@Controller
@RequestMapping("/chat")
public class ChatController {

    private List<ChatMsg> chatMessages = new ArrayList<>();

    public record writeChatMessageRequest(String authorName, String content) {
    }

    public record writeChatMessageResponse(long id, String authorName, String content) {

    }

    @PostMapping("/writeMessage")
    @ResponseBody
    public RsData<writeChatMessageResponse> writeMessage(@RequestBody writeChatMessageRequest req) {
    	ChatMsg message = new ChatMsg(req.authorName, req.content);

        chatMessages.add(message);

        return new RsData<>(
                "S-1",
                "메세지가 작성됨",
                new writeChatMessageResponse(message.getId(), message.getAuthorName(), message.getContent())
        );
    }
    
    public record MessagesResponse(List<ChatMsg> chatMessages, long count) {
		
	}

    @GetMapping("/messages")
    @ResponseBody
    public RsData<MessagesResponse> showMessages() {

        return new RsData<>(
                "S-1",
                "성공",
                new MessagesResponse(chatMessages, chatMessages.size())
        );
    }
}