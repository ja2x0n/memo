package com.example.memo.dto;


import com.example.memo.entity.Memo;
import lombok.Data;

@Data
public class MemoDto {
    private Long id;
    private String memo;


    public MemoDto (Memo memo) {
        this.id = memo.getId();
        this.memo = memo.getMemo();

    }

}
