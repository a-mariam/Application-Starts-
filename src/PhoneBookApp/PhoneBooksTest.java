package PhoneBookApp;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.print.PrinterJob;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneBooksTest {
    @Test
    public void testThat_PhoneBook_Exist(){
        PhoneBooks phoneBooks = new PhoneBooks();
    }
    @Test
    public void testThat_IsEmpty(){
        PhoneBooks phoneBooks = new PhoneBooks();
        assertTrue(phoneBooks.isEmpty());
    }

    @Test
    public void testThat_PhoneBook_CanBe_Created(){
        PhoneBooks phoneBooks = new PhoneBooks();
        phoneBooks.creatNewPhoneBook();
        assertEquals(phoneBooks.getSize(), 1);
    }
    @Test
    public void testThat_Phonebook_List_Increase_WhenNew_PhoneBook_IsCreated(){
        PhoneBooks poneBooks  = new PhoneBooks();
        poneBooks.creatNewPhoneBook();
        poneBooks.creatNewPhoneBook();
        assertEquals(2, poneBooks.getSize());
    }

    @Test
    public void testThat_PhoneBooks_GenerateId_ForPhoneBook(){
        PhoneBooks phoneBooks = new PhoneBooks();
        phoneBooks.generateId();
        assertEquals(1,phoneBooks.generateId());

    }
}
