/**
 * File IO
 *
 * Compiliation: javac FileIO_exercise.java
 * Execution: java FileIO_exercise
 *
 * Command line application to keep track of contacts.
 * Each contact is a name and phone number.
 *
 * Application should be able to:
 * 1. Show all your contacts
 * 2. Add a new contact
 * 3. Search a contact by name.
 * 4. Delete an existing contact.
 *
 * Guidelines:
 * * The text file should contain one contact per line.
 * * When the application starts, the contact list should be read from the file.
 * * Before the application exits, the contacts file should be rewritten.
 * * The user interface for your application should include a mainmenu like the following, where the user
 *      will need to enter a number between 1 and 5.
 */

import java.util.Scanner;

public class FileIO_exercise {

    private Scanner scanner;
    private List contacts;

    // Conditionally create files
    /*
    if (! Files.exists(dataFile)) {
        Files.createFile(dataFile);
    }

    List<String> lines = Files.readAllLines(dataFile);

    for(String line : lines) {
        System.out.println(line);
    }
    */


    public static void main(String[] args) {
        System.out.println("Hello File IO");
        FileIO_exercise fileio = new FileIO_exercise();
        fileio.printMenu();
    }

    public FileIO_exercise {
        this.scanner = new Scanner(System.in);
    }

    // function: prints menu
    protected void printMenu() {
        System.out.printf(
                "1. View Contacts.\n" +
                "2. Add new contact.\n" +
                "3. Search a contact by name.\n" +
                "4. Delete an existing contact.\n" +
                "5. Exit."
        );
    }

    protected void printContacts() {
        System.out.printf("Name | Phone number\n" +
                "--------------------");
        // Loop for contacts
        System.out.printf(contact.name + " | " + contact.phone);
    }

}
