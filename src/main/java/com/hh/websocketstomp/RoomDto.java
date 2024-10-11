package com.hh.websocketstomp;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RoomDto {
    private Long id;
    private String title;
    private LocalDateTime createdAt;

    public static RoomDto from(Room room) {
        return RoomDto.builder()
                .id(room.getId())
                .title(room.getTitle())
                .createdAt(room.getCreatedAt())
                .build();
    }
}
