package com.futureflick.service;

import java.util.List;

import com.futureflick.exception.ChatException;
import com.futureflick.exception.MessageException;
import com.futureflick.exception.UserException;
import com.futureflick.model.Message;
import com.futureflick.request.SendMessageRequest;

public interface MessageService  {
	
	public Message sendMessage(SendMessageRequest req) throws UserException, ChatException;
	
	public List<Message> getChatsMessages(Integer chatId) throws ChatException;
	
	public Message findMessageById(Integer messageId) throws MessageException;
	
	public String deleteMessage(Integer messageId) throws MessageException;

}
