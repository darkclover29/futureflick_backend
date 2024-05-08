package com.futureflick.dto;

import lombok.Data;

@Data
public class ReelsDto {
	
	private Long id;
	private String title;
	private String video;
	
	private UserDto user;

}
