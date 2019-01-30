package com.shubh.chat.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.shubh.chat.model.InMessage;
import com.shubh.chat.model.OutMessage;
import com.shubh.chat.model.User;

@Controller
public class ChatController {

	// once messagemapping url is hit,
	// we will send msg to all client subscribed to /topic/guestchats
	@MessageMapping("/guestchat")
	@SendTo("/topic")
	public OutMessage handleMessaging(InMessage msg) throws InterruptedException {
		System.out.println("Sending msg to all subscribers..." + msg.toString());
//		Thread.sleep(1000);

		return new OutMessage(msg.getMessage());
	}

	@MessageMapping("/userupdates")
	@SendTo("/topic/userupdates")
	public User handleTypingEvents(User user) throws InterruptedException {
		if(null != user) {
			System.out.println("Sending to all my subscribers..." + user.toString());
		}
//		Thread.sleep(1000);

		return user;
	}

	@MessageMapping("/send/message")
	public void onReceivedMesage(String message) {
		System.out.println("Hurray,Message asila re...." + message);
	}
}
