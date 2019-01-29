package com.shubh.chat.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

	@MessageMapping("/send/message")
	public void onReceivedMesage(String message) {
		System.out.println("Hurray,Message asila re...." + message);
	}
}
