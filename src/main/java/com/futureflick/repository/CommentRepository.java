package com.futureflick.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.futureflick.model.Comments;


public interface CommentRepository extends JpaRepository<Comments, Integer> {

}
