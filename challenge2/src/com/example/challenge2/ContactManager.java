package com.example.challenge2;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactManager {
    private ArrayList<Contact> contacts;

    public ContactManager() {

        contacts = new ArrayList<>();
    }

    public void showAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("\nNo contacts available.");
            return;
        }

        System.out.println("\n--- All Contacts ---");
        for (Contact contact : contacts) {
            contact.getDetails();
            System.out.println("************");
        }
    }

    public void addContact(Scanner scanner) {
        System.out.println("\nAdding a new contact...");
        System.out.print("Please enter the contact's name: ");
        String name = scanner.nextLine();
        System.out.print("Please enter contact's number: ");
        String number = scanner.nextLine();
        System.out.print("Please enter the contact's email: ");
        String email = scanner.nextLine();

        if (name.equals("") || number.equals("") || email.equals("")) {
            System.out.println("Please enter all of the information");
            addContact(scanner);
        } else {
            Contact contact = new Contact(name, number, email);
            contacts.add(contact);
            System.out.println("Contact added successfully!");
        }
    }

    public void searchContact(Scanner scanner) {
        System.out.print("\nPlease enter the contact name: ");
        String name = scanner.nextLine();

        if (name.equals("")) {
            System.out.println("Please enter the name");
            searchContact(scanner);
        } else {
            boolean doesExist = false;

            for (Contact c : contacts) {
                if (c.getName().equals(name)) {
                    doesExist = true;
                    c.getDetails();
                    break;
                }
            }

            if (!doesExist) {
                System.out.println("There is no such contact");
            }
        }
    }

    public void deleteContact(Scanner scanner) {
        if (contacts.isEmpty()) {
            System.out.println("\nNo contacts to delete.");
            return;
        }

        showAllContacts();
        System.out.print("\nEnter the number of contact to delete: ");

        try {
            int index = Integer.parseInt(scanner.nextLine()) - 1;
            if (index >= 0 && index < contacts.size()) {
                Contact removed = contacts.remove(index);
                System.out.println("Deleted: " + removed.getName());
            } else {
                System.out.println("Invalid contact number.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number.");
        }
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }
}

