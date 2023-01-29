package class15HW;

public class prime {

    /*Write a method to return whether given number is prime or not?*/


    int isprime(int num) {

        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                return false;
            } else {
                return true;
            }

        }


        public static void main (String[]args){

            prime prime = new prime();
            System.out.println(prime.isPrime(87));

        }
    }
}
