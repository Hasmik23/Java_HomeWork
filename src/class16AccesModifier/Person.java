package class16AccesModifier;

public class Person {

    private double bankBalance;   //bankBalance is belongs only to this class Person and can share with
    String Address="Street 123";   //default access level is apply. within the package
    public String name="Jon Snow";  // within the project

    void printPhonepassword(){
        System.out.println("pass123");
    }

    void printSSN() {
        System.out.println("12345678");
    }
    public void printTikTokAccount(){
        System.out.println("user123");
    }






    public static void main(String[] args) {
        Person person=new Person();
        System.out.println(person.bankBalance);
        System.out.println(person.Address);
        System.out.println(person.name);
        person.printPhonePassword();
    }
}
