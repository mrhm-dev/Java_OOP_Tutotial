package chapter3.project;

import java.util.ArrayList;
import java.util.Scanner;

public class MyContactListApp {
    /*
    * Menu
    * 1. Create New Contact
    * 2. View All Contact
    * 3. Search Contact
    * 4. Delete Contact
    * 5. Exit
    * Enter Your Choice:
    * */

    // This is the main Method
    public static void main(String[] args) {

        // Contact List Object
        ContactList contactList = new ContactList();

        Scanner scanner = new Scanner(System.in);
        int menuItemNumber = 0;

        do {
            menuView();
            menuItemNumber = scanner.nextInt();

            switch (menuItemNumber) {
                case 1:
                    Contact contact = createNewContact(scanner);
                    contactList.createContact(contact);
                    System.out.println("Successfully Created...");
                    System.out.println();
                    break;

                case 2:
                    showAllContacts(contactList.getContacts());
                    break;

                case 3:
                    searchList(contactList, scanner);
                    break;

                case 4:
                    deleteContact(contactList, scanner);
                    break;

                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Select A Number Between 1 and 5...");
                    break;

            }

        } while (menuItemNumber != 5);
    }

    // View Menu Method
    private static void menuView() {
        System.out.println(String.format("%5s%3s%s", "1.", " ", "Create New Contact"));
        System.out.println(String.format("%5s%3s%s", "2.", " ", "View All Contact"));
        System.out.println(String.format("%5s%3s%s", "3.", " ", "Search Contact"));
        System.out.println(String.format("%5s%3s%s", "4.", " ", "Delete Contact"));
        System.out.println(String.format("%5s%3s%s", "5.", " ", "Exit"));
        System.out.println("---------------------------");
        System.out.print(" Enter Your Choice : ");
    }

    // Get Input From User and Create a new Contact
    private static Contact createNewContact(Scanner scanner) {
        String name, email, phone;
        Contact contact;

        scanner.nextLine();

        System.out.println("Fill The Below Form Correctly");

        System.out.print("Enter Name* : ");
        name = scanner.nextLine();

        System.out.print("Enter Phone No* : ");
        phone = scanner.nextLine();

        System.out.print("Enter Email (Type N if Not Available) : ");
        email = scanner.nextLine();

        if (email.equalsIgnoreCase("n")) {
            contact = new Contact(name, phone);
        } else {
            contact = new Contact(name, phone, email);
        }

        return contact;
    }

    // Show All Contact method
    private static void showAllContacts(ArrayList<Contact> contacts) {
        System.out.println("All Contacts....");
        System.out.println("----------------------------");

        int i = 0;
        for (Contact contact : contacts) {
            String email = contact.getEmail();
            System.out.println(String.format("%-5d%-20s%-15s%-50s", i++, contact.getName(), contact.getPhoneNo(), email == null ? "N/A": email));
        }
        System.out.println("----------------------------");
    }

    // Search List Method
    private static void searchList(ContactList contactList, Scanner scanner) {
        scanner.nextLine();

        System.out.print("Enter Name to Search: ");
        String name = scanner.nextLine();

        Contact contact = contactList.searchContact(name);

        if (contact != null) {
            String email = contact.getEmail();
            System.out.println(String.format("%-20s%-15s%-50s", contact.getName(), contact.getPhoneNo(), email == null ? "N/A": email));
        } else {
            System.out.println("Contacts Not Found...");
        }
    }

    // Delete Contact Method
    private static void deleteContact(ContactList contactList, Scanner scanner) {
        showAllContacts(contactList.getContacts());
        System.out.print("Enter Index No: ");
        int index = scanner.nextInt();

        contactList.removeContact(index);
        System.out.println("Successfully Removed...");
    }
}
