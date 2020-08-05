package com.training.mstMainte.Entity;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class BoardVO {
	private String goods_cd; //상품코드
	private String goods_name; //상품명
	private int unit_price;  //단가
	private Timestamp entry_tsp; //등록일자
	private Timestamp update_tsp; //갱신일자
	
}
