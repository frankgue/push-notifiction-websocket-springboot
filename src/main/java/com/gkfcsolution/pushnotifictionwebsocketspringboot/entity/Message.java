package com.gkfcsolution.pushnotifictionwebsocketspringboot.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created on 2025 at 14:45
 * File: Message.java.java
 * Project: push-notifiction-websocket-springboot
 *
 * @author Frank GUEKENG
 * @date 06/11/2025
 * @time 14:45
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Message {
    private String to;
    private String text;
}
