package PhoneBookApp;

import java.util.ArrayList;


public class PhoneBooks {

    ArrayList<PhoneBook> phoneBook = new ArrayList<>();


    public boolean isEmpty(){
        return  true;
    }
    public int generateId(){
        int id = 0;
        id += 1;
        return id;
    }

    public void creatNewPhoneBook() {
        PhoneBook newPhoneBook = new PhoneBook();
        newPhoneBook.setId(generateId());
        System.out.println(newPhoneBook.getId());
        phoneBook.add(newPhoneBook);
    }
    public int getSize(){
        return phoneBook.size();
    }


}
