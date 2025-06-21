package com.chat.application.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ChatEntity {
    private Long id;
    private String sender;
    private String content;
}
