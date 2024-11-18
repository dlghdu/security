package com.example.pringbootsecuritylhy.dto;


import com.example.pringbootsecuritylhy.model.Board;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class BoardListResponseDTO {
    List<Board> boards;
    boolean last;
}
