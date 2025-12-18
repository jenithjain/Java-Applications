package com.example.challenge2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactManager contactManager = new ContactManager();
        MessageManager messageManager = new MessageManager(contactManager.getContacts());

        System.out.println("Welcome to Phone App!");

        boolean running = true;

        while (running) {
            System.out.println("\n=== Main Menu ===");
            System.out.println("1. Manage Contacts");
            System.out.println("2. Messages");
            System.out.println("3. Quit");
            System.out.print("Choose an option: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    handleContactMenu(scanner, contactManager);
                    break;
                case "2":
                    handleMessageMenu(scanner, messageManager);
                    break;
                case "3":
                    System.out.println("Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        scanner.close();
    }

    private static void handleContactMenu(Scanner scanner, ContactManager manager) {
        boolean inContactMenu = true;

        while (inContactMenu) {
            System.out.println("\n--- Contact Menu ---");
            System.out.println("1. Show all contacts");
            System.out.println("2. Add a new contact");
            System.out.println("3. Search for a contact");
            System.out.println("4. Delete a contact");
            System.out.println("5. Go back to the previous menu");
            System.out.print("Choose an option: ");

            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    manager.showAllContacts();
                    break;
                case "2":
                    manager.addContact(scanner);
                    break;
                case "3":
                    manager.searchContact(scanner);
                    break;
                case "4":
                    manager.deleteContact(scanner);
                    break;
                case "5":
                    inContactMenu = false;
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    private static void handleMessageMenu(Scanner scanner, MessageManager manager) {
        boolean inMessageMenu = true;

        while (inMessageMenu) {
            System.out.println("\n--- Messages Menu ---");
            System.out.println("1. See the list of all messages");
            System.out.println("2. Send a new message");
            System.out.println("3. Go back to the previous menu");
            System.out.print("Choose an option: ");

            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    manager.showAllMessages();
                    break;
                case "2":
                    manager.sendMessage(scanner);
                    break;
                case "3":
                    inMessageMenu = false;
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}


