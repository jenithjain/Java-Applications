package com.example.challenge2;

import java.util.ArrayList;
import java.util.Scanner;

public class MessageManager {
    private ArrayList<Contact> contacts;
    private int messageIdCounter;

    public MessageManager(ArrayList<Contact> contacts) {
        this.contacts = contacts;
        this.messageIdCounter = 1;
    }

    public void showAllMessages() {
        ArrayList<Message> allMessages = new ArrayList<>();

        for (Contact c : contacts) {
            allMessages.addAll(c.getMessages());
        }

        if (allMessages.isEmpty()) {
            System.out.println("\nNo messages yet.");
        } else {
            System.out.println("\n--- All Messages ---");
            for (Message m : allMessages) {
                m.getDetails();
                System.out.println("************");
            }
        }
    }

    public void sendMessage(Scanner scanner) {
        System.out.print("\nPlease enter the contact name: ");
        String name = scanner.nextLine();

        if (name.equals("")) {
            System.out.println("Please enter the name");
            sendMessage(scanner);
        } else {
            boolean doesExist = false;

            for (Contact c : contacts) {
                if (c.getName().equals(name)) {
                    doesExist = true;

                    System.out.print("What are you going to say?: ");
                    String text = scanner.nextLine();

                    if (text.equals("")) {
                        System.out.println("Please enter some message");
                        sendMessage(scanner);
                    } else {
                        String id = String.valueOf(messageIdCounter);
                        messageIdCounter++;

                        Message newMessage = new Message(text, name, id);
                        c.addMessage(newMessage);
                        System.out.println("Message sent!");
                    }
                    break;
                }
            }

            if (!doesExist) {
                System.out.println("There is no such contact");
            }
        }
    }
}

