package com.futureflick.service;

import java.util.List;

import com.futureflick.exception.StoryException;
import com.futureflick.exception.UserException;
import com.futureflick.model.Story;

public interface StoryService {

	public Story createStory(Story story,Integer userId) throws UserException;
	
	public List<Story> findStoryByUserId(Integer userId) throws UserException, StoryException;
	
	
}
