package com.futureflick.service;

import java.util.List;

import com.futureflick.exception.UserException;
import com.futureflick.model.Reels;
import com.futureflick.model.User;

public interface ReelsService {
	
	public Reels createReel(Reels reel,User user);
	public List<Reels> findAllReels();
	public List<Reels> findUsersReel(Integer userId) throws UserException;

}
