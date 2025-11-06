package com.gkfcsolution.pushnotifictionwebsocketspringboot.controller;

import com.gkfcsolution.pushnotifictionwebsocketspringboot.entity.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created on 2025 at 14:39
 * File: null.java
 * Project: push-notifiction-websocket-springboot
 *
 * @author Frank GUEKENG
 * @date 06/11/2025
 * @time 14:39
 */
@Controller
@Slf4j
public class MessageController {
    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    @MessageMapping("/application") // /app/application
    @SendTo("/all/messages")
    public Message send(final Message message){
        return message;
    }

    @MessageMapping("/private") //  /app/private
    public void sendToSpecificUser(@Payload Message message){
        simpMessagingTemplate.convertAndSendToUser(message.getTo(), "/specific", message);
    }

    @GetMapping("/")
    public String index(){
        return "index";
    }
}
