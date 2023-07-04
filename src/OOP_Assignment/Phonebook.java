package OOP_Assignment;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Phonebook {
    String [] elements;
    int index = 0;
    int size;
    int id;
    ArrayList<Contactss> contact = new ArrayList<>();

    public void add( String element){
        elements[index] = element;
        index++;
        System.out.println(Arrays.toString(elements));
    }
    public int generateId(){
        id += 1;
        return id;
    }


    public void addContact(String phoneNumber, String name) {
         Contactss newContact = new Contactss(phoneNumber,name, id);
         contact.add(newContact);
         id++;
    }
    public Contactss findContact(Contactss contacts){
        for (Contactss cont : contact){
         if (Objects.equals(contacts, cont)){
             System.out.println(cont);
             return cont;
         }
        }
        return null;
    }

    public boolean isEmpty() {
        if (index  != 0){
        return false;
        }
   return  true;
    }

    public Contactss findContactByName(String name) {
        for(Contactss names: contact){
            if (Objects.equals(name, names )){
                return names;
            }
        }
        return  null;
    }

    public int size() {
      return elements.length;
    }
}
