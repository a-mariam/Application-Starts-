package OOP_Assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class PhonebookTest {
    Phonebook phonebook = new Phonebook();
@Test
    public  void testThat_Phonebook_Exist(){

    Phonebook phonebook = new Phonebook();
}

@Test
public void testThat_Phonebook_IsEmpty(){
    phonebook.isEmpty();
    assertTrue(phonebook.isEmpty());
}


//@Test
//    public void testThat_ContactCan_BeCreated_AndAdded_ToPhonebook(){
//    phonebook.addContact("0709905867","nanny");
//    assertEquals(phonebook.getSize(),1);
//}
    @Test
    public void testThat_ContactCan_FindBy_Name(){
     phonebook.addContact("08055958617","mariam");
        phonebook.findContactByName("mariam");
    }

}