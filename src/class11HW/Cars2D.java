package class11HW;

public class Cars2D {
    public static void main(String[] args) {

        /* Create 2d array of cars; American, German, Korean and Italian.
           Then retrieve all values from that array.  */

        String[][] cars = {{"American", "German", "Korean", "Italian"}, {"GMC", "Volvo", "KIA", "Fiat"}};

        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {

                System.out.println(cars[i][j]);


            }
        }
    }
}
