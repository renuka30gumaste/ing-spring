package com.examplejms.jmsdemo;

public class Message {
    private String receiver;
    private String body;

    public Message() {
    }

    public Message(String receiver, String body) {
        this.receiver = receiver;
        this.body = body;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return String.format("Message{receiver: %s, body: %s}", getReceiver(), getBody());
    }
}
