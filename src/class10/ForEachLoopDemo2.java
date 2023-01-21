package class10;

public class ForEachLoopDemo2 {
    public static void main(String[] args) {

        // Limitation of Foreach Loop
        int[] arr = {10,13, 20, 30, 45, 50};
        //arr[1]=0;     to update a single element in an array


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
            }
        }

        //Replace all odd numbers in this array with the help of a normal loop
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2!=0) {
                arr[i]=0;  //[10,0,20,0,0,50] replaced odd numbers by zero
            }
        }
        System.out.println("after replacing all odd numbers with zero");
        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);

        }
    }
}

