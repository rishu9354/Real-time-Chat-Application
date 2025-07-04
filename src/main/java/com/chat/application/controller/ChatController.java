package com.chat.application.controller;

import com.chat.application.model.ChatEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {
    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public ChatEntity sendMessage(ChatEntity message){
        return message;
    }

    @GetMapping("chat")
    public String Chat(){
        return "chat";
    }
}
