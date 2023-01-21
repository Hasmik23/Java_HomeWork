package class8;

public class NestedLoop4 {
    public static void main(String[] args) {

       /* Task- print 12345
                      12345
                      12345 */

        for (int i = 0; i < 3; i++) { // execute below line 3 times

            for (int j = 1; j < 6; j++) {// prints the value of j 5 times
                System.out.print(j+" ");

            }
            System.out.println();
        }


        System.out.println("**********");
        for (int i = 0; i < 3; i++) {

            for (int j = 1; j < 6; j++) {
                System.out.print(i+" ");// prints the value of i 5 times

            }
            System.out.println();
        }
    }
}
