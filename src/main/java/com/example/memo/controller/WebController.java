package com.example.memo.controller;

import com.example.memo.service.MemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class WebController {
    private final MemoService memoService;

    @GetMapping("/")
    public String Memo(Model model){
        model.addAttribute("memos", memoService.memos());
        return "index";



    }
}
