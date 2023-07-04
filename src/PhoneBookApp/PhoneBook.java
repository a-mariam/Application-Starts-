package PhoneBookApp;

import java.util.ArrayList;
import java.util.Objects;

public class PhoneBook {
    private int id;
    ArrayList<Contact> contacts = new ArrayList<>();

    public PhoneBook(){

    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId(){
        return  id;
    }

    public boolean isEmpty() {
        return true;
    }

    public int getSize() {
        return contacts.size();
    }


    public void createContact(String number, String name) {
        Contact contact = new Contact(name, number);
        contacts.add(contact);
    }

    public Contact findContactByNumber(String number){
       for (Contact contact: contacts){
           if (Objects.equals(contact.getNumber(),number)){
               System.out.println(contact);
               return contact;
           }
       }
       throw new NullPointerException("Contact not found");
    }

    public void deleteContact(String number) {
        try{
       Contact contact = findContactByNumber(number);
       if (contact.getNumber().equals(number)) {
           contacts.remove(contact);
           System.out.println("Contact deleted successfully");
       }
        }catch (NullPointerException ex){
            System.out.println("Contact does not exist");
        }
    }
    public Contact findContactByName(String name){
        for (Contact contact: contacts){
            if (contact.getName().equalsIgnoreCase(name)){
                System.out.println(contact.toString());
                    return contact;
            }
        }
        throw new NullPointerException("Contact does not exist");
    }

    public void changeContactName(String newContactName, String currentContactName) {
        try{
           findContactByName(currentContactName).setName(newContactName);
            System.out.println("Contact name has been updated");
        }catch (NullPointerException ex){
            System.out.println("Contact does not exist");
        }
    }

    public void changeContactNumber(String currentContactNumber, String newContactNumber) {
        try{
            findContactByNumber(currentContactNumber).setNumber(newContactNumber);
            System.out.println("Contact number has been updated");
        }catch (NullPointerException ex){
            System.out.println("Number does not exist");
        }
    }


    public void ViewAllContact() {
        for (Contact contact: contacts){
            System.out.println(contact);
        }
        if (contacts.size() == 0){
            System.out.println("No Contact is Found!!!");
        }
    }

    public void updateContact(String currentContactNumber, String newContactNumber, String currentContactName, String newContactName) {
        changeContactName(newContactName,currentContactName);
        changeContactNumber(currentContactNumber,newContactNumber);
    }
}
