package class10;

public class ArrayDemo1 {
    public static void main(String[] args) {

       //create array and store numbers 1 to 5

        int[] arr={10,20,30,40,50};
        System.out.println(arr[4]);
        System.out.println(arr[1]+" "+arr[4]);

       // for (int i = 0; i < 5; i++){
          //  System.out.println(arr[i]);
            //or

            for (int i = 0; i < arr.length; i++){
                System.out.println(arr[i]);

        }
            //inhanced/for eachloop.whenever possible ude below
            System.out.println("inhanced for loop");
            for(int number:arr){
                System.out.println(number);
            }
        }

    }

