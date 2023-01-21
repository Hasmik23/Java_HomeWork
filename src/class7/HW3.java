package class7;

public class HW3 {
    public static void main(String[] args){
        //Print odd numbers from 20 to 50 (2 ways)
        for (int i = 20; i <= 50; i++) {
            if (i%2!=0) {
                System.out.println(i);
            }
        }
      System.out.println("*******************");

        //Print odd numbers from 50 to 20 (2 ways)
        for (int i = 50; i >= 20; i--) {
            if (i%2!=0) {
                System.out.println(i);
            }

        }
    }
}
