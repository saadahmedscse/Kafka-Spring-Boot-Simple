package com.saadahmedev.producerservice.service;

import com.saadahmedev.producerservice.dto.common.ApiResponse;
import com.saadahmedev.producerservice.dto.message.MessageRequest;
import com.saadahmedev.producerservice.util.AppConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private Logger logger = LoggerFactory.getLogger(MessageServiceImpl.class);

    @Override
    public ResponseEntity<?> sendMessage(MessageRequest messageRequest) {
        kafkaTemplate.send(AppConstants.MESSAGE_TOPIC, messageRequest.getMessage());
        logger.info(messageRequest.getMessage());

        return new ResponseEntity<>(new ApiResponse(true, "Message sent successfully"), HttpStatus.OK);
    }
}
