package class9;

public class arrayDemo5 {
    public static void main(String[] args) {

        int [] numbers= new int[5]; //create empty array of size 5 will be created
        System.out.println(numbers[2]);  // result is 0

        numbers[0]=50;
        numbers[1]=50;
        numbers[2]=30;
        numbers[3]=55;
        numbers[4]=60;


        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);

    }
}
}
