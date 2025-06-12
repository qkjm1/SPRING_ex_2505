package com.example.demo.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatMsg {
	
	 private long id;
	    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
	    private LocalDateTime createDate;
	    private String authorName;
	    private String content;

	    public ChatMsg(String authorName, String content) {
	        this(ChatMessageIdGenerator.getNextId(), LocalDateTime.now(), authorName, content);
	    }

	
	class ChatMessageIdGenerator {
	    private static long id = 0;

	    public static long getNextId() {
	        return ++id;
	    }
	}
	
}