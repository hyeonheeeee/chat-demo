package com.hh.websocketstomp;

import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1")
public class ChatController {

    private final ChatService chatService;

    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @MessageMapping("/{roomId}/chats")
    @SendTo("/topic/{roomId}")
    public ChatDto sendMessage(@DestinationVariable("roomId") Long roomId, ChatDto chatDto) {
        return chatService.saveChat(roomId, chatDto);
    }
}
