package class16AccesModifier;

public class PersonTester {
    public static void main(String[] args) {

        Person person=new Person();
        System.out.println(person.bankBalance);  // error private not for this class
        System.out.println(person.Address);
        System.out.println(person.name);
        person.printPassword();  // we get an error it's private

        Scanner scanner=new Scanner(System.in);
        scanner.next();
    }
}
