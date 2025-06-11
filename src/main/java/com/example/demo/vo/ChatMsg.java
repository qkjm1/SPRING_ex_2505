package com.example.demo.vo;

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
	private LocalDateTime createDate;
	private String authorName;
	private String content;
	
	
	public ChatMsg(String authorName, String content) {
		this(1, LocalDateTime.now(), authorName, content);
	}

}