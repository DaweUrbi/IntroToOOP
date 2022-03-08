package assignments.contactList;

import java.util.Scanner;
import static assignments.contactList.App.printApp;

public class Driver {
    public static void main(String[] args) {

        Contact c1 = new Contact("David Urban", "111-111-1111", "NASA", "333-333-3333", "Vancouver");
        ContactList contacts = new ContactList();

        contacts.addContact(c1);

        printApp();

        while (true) {
            System.out.println("Enter your option:");
            Scanner in = new Scanner(System.in);
            String input = in.nextLine();
            String usernameInput = InputCollector.getUserInput(input);
            if (usernameInput.equals("5")) {
                System.exit(0);

            } else if (usernameInput.equals("1")) {
                for (int i = 0; i < contacts.getContacts().size(); i++) {
                    System.out.print(i);
                    System.out.println(contacts.getContacts().get(i).toString());
                }

            } else if (usernameInput.equals("2")) {
                String name;
                while (true) {
                    System.out.println("Enter name:");
                    name = in.nextLine();
                    if (("").equals(name)) {
                        System.out.println("You must enter this field.");
                    } else {
                        break;
                    }
                }
                String mobile;
                while (true) {
                    System.out.println("Enter mobile number:");
                    mobile = in.nextLine();
                    if (("").equals(mobile)) {
                        System.out.println("You must enter this field.");
                    } else {
                        break;
                    }
                }
                System.out.println("Enter work number:");
                String workNumber = in.nextLine();
                System.out.println("Enter company:");
                String company = in.nextLine();
                System.out.println("Enter city:");
                String city = in.nextLine();
                Contact contact = new Contact(name, mobile, workNumber, company, city);
                contacts.addContact(contact);
                System.out.println("New contact successfully added!");
                System.out.println();
                printApp();

            } else if (usernameInput.equals("3")) {
                System.out.println("Enter the position of the contact for remove from list:");
                int position = in.nextInt();
                if (position > contacts.getContacts().size() || position < 0) {
                    System.out.println("Invalid number!");
                } else {
                    Object removedName = contacts.getContacts().get(position);
                    contacts.removeContact(position);
                    System.out.println("Successfully removed!" + removedName);
                    System.out.println();
                    printApp();
                }

            } else if (usernameInput.equals("4")) {
                for (int x = 0; x < contacts.getContacts().size(); x++) {
                    System.out.print(x);
                    System.out.println(contacts.getContacts().get(x).toString());
                }
                System.out.println("Enter the index of the contact to update:");

                int position = in.nextInt();
                if (position > contacts.getContacts().size() - 1 || position < 0) {
                    System.out.println("Invalid number");
                } else {
                    String name;
                    while (true) {
                        System.out.println("Enter name:");
                        name = in.nextLine();
                        if (("").equals(name)) {
                            System.out.println("You must enter this field.");
                        } else {
                            break;
                        }
                    }
                    String mobile;
                    while (true) {
                        System.out.println("Enter mobile:");
                        mobile = in.nextLine();
                        if (("").equals(mobile)) {
                            System.out.println("You must enter this field.");
                        } else {
                            break;
                        }
                    }
                    System.out.println("Enter work number:");
                    String workNumber = in.nextLine();
                    System.out.println("Enter company:");
                    String company = in.nextLine();
                    System.out.println("Enter city:");
                    String city = in.nextLine();
                    contacts.updateContact(position, name, mobile, workNumber, company, city);
                    System.out.println("Successfully updated!");
                    System.out.println();
                    printApp();
                }

            } else {
                System.out.println("Invalid Input. Enter number between 1 and 5!");
            }
        }
    }
}