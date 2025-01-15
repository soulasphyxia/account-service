package org.soulasphyxia.accountservice.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class Like {

    private Long id;
    private Long userId;
    private Long videoId;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
