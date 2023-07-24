package com.callor.rent.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.Setter;

/*
 * STS 	Ctrl+Shift+Y : 모두 소문자로 만들기
 * 		Ctrl+Shift+X : 모두 대문자로 만들기
 * 		Ctrl+D : 현재 커서라인 삭제
 * 		Ctrl+Z : Undo, 명령 취소하기
 */

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookDto {
	
	private String b_code;//	varchar(6)
	private String b_name;//	varchar(125)
	private String b_auther;//	varchar(125)
	private String b_comp;//	varchar(125)
	private int b_year;//	varchar(15)
	private int b_iprice;//	int
	private int b_rprice;//	int
}