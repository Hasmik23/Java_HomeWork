package class15HW;

public class prime {

    /*Write a method to return whether given number is prime or not?

    return type >= boolean   because prime or not
    name >= isPrime
    parameters >= int*/



    boolean isPrime(int number) {

        boolean flag = true;
        if (number <= 1) {
            for (int i = 2; i <= number; i++) {
                if (number % i == 0) {
                    flag = false;
                    break;  // do not continue
                }
            }
        } else {
            flag = false;
        }
        return flag;
    }


        public static void main(String[] args){

            prime Prime = new prime();
            System.out.println(Prime.isPrime(87));  // return something so we can put inside sout

        }
    }

