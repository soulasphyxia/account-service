package org.soulasphyxia.accountservice.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Subscription {
    private Long id;
    private Long actorId;
    private Long targetId;
}
