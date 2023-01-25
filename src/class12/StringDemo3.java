package class12;

public class StringDemo3 {

    public static void main(String[] args) {

        String firstName="Hasmik";
        String lastName="Simon";
        String fullName=(firstName+" "+lastName);
        System.out.println(fullName);
        System.out.println(firstName+" "+lastName);   //most widely used
        System.out.println(firstName.concat(" "+lastName));

    }


    }