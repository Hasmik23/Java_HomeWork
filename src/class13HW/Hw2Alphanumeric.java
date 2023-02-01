package class13HW;

public class Hw2Alphanumeric {
    public static void main(String[] args) {
        /*Create a String that should be combination of letters, numbers and special characters.
    Find out how many Alphanumeric(abd AZ 284) characters are there in the String.*/

        String combination = "abdAZ2846^%#$&";
        System.out.println(combination.replaceAll("[^%#$&,a-z-Z0]","").length());


    }
}
