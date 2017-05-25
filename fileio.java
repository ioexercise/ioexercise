/**
 * File IO
 *
 * Compiliation: javac fileio.java
 * Execution: java fileio
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
import java.util.List;

public class fileio {

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
        fileio fileio = new fileio();
        fileio.printMenu();
        int userInput = fileio.getInt(1,5);
        fileio.userSelection(userInput);
    }

    public fileio() {
        this.scanner = new Scanner(System.in);
    }

    // function: prints menu
    protected void printMenu() {
        System.out.printf(
                "1. View Contacts.\n" +
                "2. Add new contact.\n" +
                "3. Search a contact by name.\n" +
                "4. Delete an existing contact.\n" +
                "5. Exit.\n"
        );
        System.out.print("Enter an option 1-5: ");
    }

    public void printContacts() {
        System.out.printf("Name | Phone number\n" +
                "--------------------");
    }

    public void userSelection(int userInput) {
        switch(userInput){
            case 1:
//                View Contacts
                this.printContacts();
                break;
            case 2:
//                Add a new contact

                break;
            case 3:
//                Search a contact by name
                break;
            case 4:
//                Delete an existing contact
                break;
            case 5:
//                Exit
                break;
        }
    }


    public String getString() {
        return this.scanner.nextLine();
    }


    public int getInt(int min, int max){
        int num;
        try {
            String possibleNumber = this.getString();
            num = Integer.valueOf(possibleNumber);
        } catch (NumberFormatException e) {
            System.out.print("Please enter a number between " + min + " and " + max + ": ");
            return getInt(min, max);
        }

        if(num >= min && num <= max){
            return num;
        }

        System.out.println(num + " number out of range, try again");
        return getInt(min, max);
    }

}
