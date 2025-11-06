package com.gkfcsolution.pushnotifictionwebsocketspringboot.config;

import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.stereotype.Controller;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

/**
 * Created on 2025 at 14:32
 * File: null.java
 * Project: push-notifiction-websocket-springboot
 *
 * @author Frank GUEKENG
 * @date 06/11/2025
 * @time 14:32
 */
@Controller
@EnableWebSocketMessageBroker
public class WebSocketBrokerConfig implements WebSocketMessageBrokerConfigurer {
    @Override
    public void registerStompEndpoints(StompEndpointRegistry config) {
        config.addEndpoint("ws").withSockJS();
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.enableSimpleBroker("/all", "/specific");
        registry.setApplicationDestinationPrefixes("/app");
    }
}
