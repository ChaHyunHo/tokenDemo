package com.example.tokendemo.domain;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Board {
    private Long boardNo;
    private String title;
    private String content;
    private String witer;
    private LocalDateTime regDate;
}
