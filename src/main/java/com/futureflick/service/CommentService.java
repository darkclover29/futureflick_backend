package com.futureflick.service;

import com.futureflick.exception.CommentException;
import com.futureflick.exception.PostException;
import com.futureflick.exception.UserException;
import com.futureflick.model.Comments;

public interface CommentService {
	
	public Comments createComment(Comments comment,Integer postId,Integer userId) throws PostException, UserException;

	public Comments findCommentById(Integer commentId) throws CommentException;
	public Comments likeComment(Integer CommentId,Integer userId) 
			throws UserException, CommentException;
}
