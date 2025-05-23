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
public class Reply {
	
	private int id;
	private String regDate;
	private String updateDate;
	private int articleId;
	private int memberId;
	private String reMsg;
	
}