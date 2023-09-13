package com.saadahmedev.producerservice.service;

import com.saadahmedev.producerservice.dto.message.MessageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface MessageService {

    ResponseEntity<?> sendMessage(MessageRequest messageRequest);
}
