package com.futureflick.dto;

import java.time.LocalDateTime;

import com.futureflick.model.User;

import lombok.Data;

@Data
public class StoryDto {

	private Integer id;
	private User user;
	private String image;
	private String captions;
	private LocalDateTime timestamp;
	
}
