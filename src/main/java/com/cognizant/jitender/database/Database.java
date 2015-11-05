package com.cognizant.jitender.database;

import java.util.HashMap;
import java.util.Map;

import com.cognizant.jitender.messanger.model.Message;

public class Database {
	
	private static Map<Long, Message> messages = new HashMap<>();

	public static Map<Long, Message> getMessages() {
		return messages;
	}



}
