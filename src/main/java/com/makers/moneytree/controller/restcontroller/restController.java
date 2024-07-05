package com.makers.moneytree.controller.restcontroller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/llm")
public class restController {

    @PostMapping("/chat")
    public String chat(@RequestBody String query) {
        return "Chatting...";
    }
}
