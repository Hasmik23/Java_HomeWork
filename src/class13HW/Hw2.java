package class13HW;

public class Hw2 {
    public static void main(String[] args) {
        /*Create a String that should be combination of letters, numbers and special characters.
    Find out how many Alphanumeric(abd AZ 284) characters are there in the String.*/

        String combination = "abd AZ 284";

        int count=0;
        for (int i = 0; i < combination.length; i++) {

            count++;
            System.out.println(count +" charactors in "+String combination);
        }
    }
}
