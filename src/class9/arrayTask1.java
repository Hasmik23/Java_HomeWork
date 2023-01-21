package class9;

public class arrayTask1 {
    public static void main(String[] args) {

        /*Create an empty array thennstore 45  44  33  20 and 10 in it then use a loop
        to add all the elements which are present on even indexes and print it after adding them */

        int[] numbers = new int[5]; //create empty array of size 4 will be created
        //System.out.println(numbers[2]);  // result is 0

        numbers[0] = 45;
        numbers[1] = 44;
        numbers[2] = 33;
        numbers[3] = 20;
        numbers[4] = 10;

        int sum=0;

       for (int i = 0; i < numbers.length; i++) {
            if(i%2==0) {
                sum = sum + numbers[i];

            }
            }
        System.out.println("sum= "+sum);

        }
    }

