package class7;

public class ForLoops {
    public static void main(String[] args) {

        // prints number from 0 to 9

        int number = 0;
        while (number < 10) {
            System.out.println(number);
            number++;
        }
        //initialize; condition; increment or decrement

        for (int i = 0; i < 10;i++){
            System.out.println(i);

        }
        //using a for loop print odd numbers from 1 to 20;

        for (int a = 1; a <= 20; a++) {
            if (a % 2 == 0) {
            } else {
                System.out.println(a);
            }
        }
    }
}
