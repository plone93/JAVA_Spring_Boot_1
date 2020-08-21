package com.training.mstMainte.entity;

import java.sql.Timestamp;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class BoardVO {
	private String goods_number; //상품코드
	private String goods_name; //상품명
	private String goods_id; //상품 아이디(구분)
	private int goods_price;  //단가
	private int goods_cost;//원가
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Timestamp insert_date; //등록일자
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Timestamp update_date; //갱신일자
	
}
