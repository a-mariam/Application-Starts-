package PhoneBookApp;

public class Contact {
    private String name;
    private String number;
    public Contact(String contactName, String num){
     this.number = num;
     this.name = contactName;
    }
    @Override
    public String toString(){
        return String.format("""
                %s
                %s""",name,number);
    }

    public  String getName(){
        return this.name;
    }
    public String getNumber(){
        return this.number;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setNumber(String number){
        this.number = number;
    }
}
