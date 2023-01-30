package class10HW;

public class HW1 {
    public static void main(String[] args) {

       /*Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
         Print the sum of all numbers.*/

        int[][] numbers = new int[3][3];

        numbers[0][0] = 10;
        numbers[0][1] = 20;
        numbers[0][2] = 30;

        numbers[1][0] = 110;
        numbers[1][1] = 120;
        numbers[1][2] = 130;

        numbers[2][0] = 210;
        numbers[2][1] = 220;
        numbers[2][2] = 230;

        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; i < 4; i++) {

                sum = sum + numbers[j];
            }
            System.out.println(sum);


        }
    }
}






