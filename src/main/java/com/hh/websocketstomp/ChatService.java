package com.hh.websocketstomp;

import org.springframework.stereotype.Service;

@Service
public class ChatService {

    private final ChatRepository chatRepository;

    public ChatService(ChatRepository chatRepository) {
        this.chatRepository = chatRepository;
    }

    public ChatDto saveChat(Long roomId, ChatDto chatDto) {
        Chat chat = Chat.builder()
                .roomId(roomId)
                .senderId(chatDto.getSenderId())
                .message(chatDto.getMessage())
                .build();

        Chat savedChat = chatRepository.save(chat);

        return ChatDto.from(savedChat);
    }
}
