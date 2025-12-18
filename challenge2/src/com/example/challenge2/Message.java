package com.example.challenge2;

public class Message {
    private String recipient;
    private String text;
    private String id;

    public Message(String text, String recipient, String id) {
        this.text = text;
        this.recipient = recipient;
        this.id = id;
    }

    public void getDetails() {
        System.out.println("To: " + recipient);
        System.out.println("Message: " + text);
        System.out.println("ID: " + id);
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}

