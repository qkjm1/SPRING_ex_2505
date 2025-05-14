package com.example.demo.vo;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Pager {
	private int pageNum;
	private int totalCnt;
	private int pageSize;
	private int blockSize;
	
	private int totalBdPage;
	private int startRow;
	private int endRow;
	private int startPage;
	private int prevPage;
	private int nextPage;
	
	public Pager(int pageNum, int totalCnt, int pageSize, int blockSize) {
		this.nextPage=pageNum;
		this.totalCnt=totalCnt;
		this.pageSize=pageSize;
		this.blockSize=blockSize;
		
		calcPage();
	}

	private void calcPage() {	
		
	}
}
