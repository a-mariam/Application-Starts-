package PhoneBookApp;

import org.junit.platform.commons.function.Try;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    mainMenu();
    }
    private static Scanner keyboardInput = new Scanner(System.in);
    private  static PhoneBook phone = new PhoneBook();
    public static void mainMenu(){
        String menu = """
                1.Create Contact
                2.Delete Contact
                3.Find Contact By Name
                4.Find Contact By Number
                5.Update Contact
                6.View all Contacts
                7.Exist
                 """;
        String userInput = "";
        while(userInput.isEmpty()) {
            try {
                userInput = input(menu);
                switch (userInput.charAt(0)) {
                    case '1' -> createContact();
                    case '2' -> deleteContact();
                    case '3' -> findContactByName();
                    case '4' -> findContactByNumber();
                    case '5' -> updateContact();
                    case '6' -> viewAllContact();
                    case '7' -> exist();
                    default -> mainMenu();
                }
            }catch(StringIndexOutOfBoundsException ex){
                display("Please Enter a number..");
            }
        }
    }
    public static void createContact(){
        String phoneNumber = "";
        while(phoneNumber.isEmpty()){
            phoneNumber = input("Enter Phone Number: ");
        }
        String name = "";
        while(name.isEmpty()){
            name = input("Enter Contact Name: ");
        }
        phone.createContact(phoneNumber,name);
        display("Contact created successfully");
        mainMenu();
    }
    public static void deleteContact(){
        String name = "";
        while(name.isEmpty()){
            name = input("Enter phone number: ");
        }
        phone.deleteContact(name);
        mainMenu();
    }
    public  static  void findContactByName(){
        String name = "";
        while(name.isEmpty()) {
            name = input("Enter contact name: ");
        }
        try {
            phone.findContactByName(name);
            mainMenu();
        }catch (NullPointerException ex){
            System.out.println("Contact does not exist");
            mainMenu();
        }
        
    }
    public static void findContactByNumber(){
        String number = "";
        while(number.isEmpty()){
            number = input("Enter contact number: ");
        }
        try {
            phone.findContactByNumber(number);
            mainMenu();
        }catch (NullPointerException ex){
            System.out.println("Contact not found..");
            mainMenu();
        }
    }
    public static  void updateContact(){
        String newContactName = "";
        String newContactNumber = "";
        String oldContactName = "";
        String oldContactNumber = "";
        while(newContactName.isEmpty()){
            newContactName = input("Please Enter new contact name: ");
        }
        while(newContactNumber.isEmpty()){
            newContactNumber = input("Please enter new contact number:  ");
        }
        while(oldContactName.isEmpty()){
            oldContactName = input("Please enter current phone name: ");
        }
        while(oldContactNumber.isEmpty()){
            oldContactNumber = input("Please enter current phone number: ");
        }
        phone.updateContact(oldContactNumber,newContactNumber,oldContactName,newContactName);

        mainMenu();
    }
    public  static  void viewAllContact(){
        phone.ViewAllContact();
       mainMenu();
    }

    public static void exist(){
        display("Thanks for using our Application");
    }
    public static void display(String messages){
        System.out.println(messages);
    }
    public static String input(String messages){
        display(messages);
        return keyboardInput.nextLine();
    }
}
