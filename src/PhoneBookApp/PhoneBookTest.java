package PhoneBookApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {
@Test
    public  void testThat_PhoneBook_Exist(){
    PhoneBook phoneBook = new PhoneBook();
}
@Test
    public void testThat_phoneBook_IsEmpty(){
    PhoneBook phone = new PhoneBook();
    phone.isEmpty();
}
@Test
    public void testThat_PhoneBook_CanCreate_Contact(){
    PhoneBook phone = new PhoneBook();
    phone.createContact("080559586", "mama");
    assertEquals(1,phone.getSize());
}
@Test
    public void testThat_Contact_CanBe_DeletedBy_NumberFrom_Phonebook(){
    PhoneBook phone = new PhoneBook();
    phone.createContact("08055958617","many");
    phone.deleteContact("08055958617");
    assertEquals(0,phone.getSize());
}
@Test
    public void testThat_ContactName_CanBe_Update(){
    PhoneBook phoneBook = new PhoneBook();
    phoneBook.createContact("09055958617","mom");
    phoneBook.changeContactName("MUMMY","mom");
    phoneBook.findContactByName("MUMMY");
}
@Test
    public void testThat_ContactNumber_CanBe_Update(){
    PhoneBook phoneBook = new PhoneBook();
   phoneBook.createContact("08055958617","mama");
   phoneBook.changeContactNumber("08055958617","08053588917");
   phoneBook.findContactByNumber("08053588917");
}
@Test
    public void testThat_ShowAllContact(){
    PhoneBook phone = new PhoneBook();
    phone.createContact("07044063892","MIMI");
    phone.ViewAllContact();
}
@Test
    public void  testThat_Contact_CanBe_Updated(){
    PhoneBook phone = new PhoneBook();
    phone.createContact("08055958617","mama");
    phone.updateContact("08055958617","08038391869","mama","mommy");
    phone.findContactByNumber("08038391869");
}
}