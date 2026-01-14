package com.example.memo.service;

import com.example.memo.dto.MemoDto;
import com.example.memo.repository.MemoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class MemoService {
    private final MemoRepository memoRepository;


    public List<MemoDto> memos() {
        return memoRepository.findAll()
                .stream()
                .map(MemoDto::new)
                .toList();




    }
}