package class33HW;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
       /* How would handle InputMismatchException? Input Mismatch Exception when user enters
          mismatch value then programmer expected.*/

        Scanner sc =new Scanner(System.in);
        try {
            System.out.println("Enter a number to get its square value ");
            Integer num = sc.nextInt(); // we give any float value as input
            System.out.println((num*num));
        } catch (InputMismatchException e) {
            System.out.println(e);
        }

    }

}
