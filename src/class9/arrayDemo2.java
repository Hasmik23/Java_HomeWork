package class9;

public class arrayDemo2 {
    public static void main(String[] args) {

        // 10 20 30 40 50

        int sum = 0;

        int [] numbers = {10, 20, 30, 45, 50};
        sum = 0;

            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
            sum += numbers[i]; // sum=sum+number[i];
        }
            System.out.println(sum);

    }
}




