package com.saadahmedev.producerservice.dto.message;

public class MessageRequest {

    private String message;

    public MessageRequest() {}

    public MessageRequest(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
