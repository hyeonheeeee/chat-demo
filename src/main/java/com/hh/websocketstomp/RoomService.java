package com.hh.websocketstomp;

import org.springframework.stereotype.Service;

@Service
public class RoomService {

    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public void newRoom(RoomDto roomDto) {
        Room room = Room.builder()
                .title(roomDto.getTitle())
                .build();

        roomRepository.save(room);
    }
}
