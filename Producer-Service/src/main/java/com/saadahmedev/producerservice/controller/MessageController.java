package com.saadahmedev.producerservice.controller;

import com.saadahmedev.producerservice.dto.message.MessageRequest;
import com.saadahmedev.producerservice.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @PostMapping("/send")
    public ResponseEntity<?> sendMessage(@RequestBody MessageRequest messageRequest) {
        return messageService.sendMessage(messageRequest);
    }
}
