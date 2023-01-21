package class9;

public class arrayTask4 {
    public static void main(String[] args) {

        double[] arr={10.5,12.0,45,10.5,23,10.5};
                //how many times the number 10.5 is present in the array\

        int sum=0;// teacher's int count=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] ==10.5) {
                sum = sum + 1; //count++; or count=count+1;
            }
        }
        System.out.println(sum);

    }
}

