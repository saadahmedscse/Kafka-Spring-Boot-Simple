package com.saadahmedev.consumerservice.config;

import com.saadahmedev.consumerservice.util.AppConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {

    private final Logger logger = LoggerFactory.getLogger(KafkaConfig.class);

    @KafkaListener(topics = AppConstants.MESSAGE_TOPIC, groupId = AppConstants.GROUP_ID)
    public void receivedMessage(String message) {
        logger.info(message);

        //send message to specific user or save into database
    }
}
