package class15HW;

public class LargeNumber {

    //Create a method that will take 2 parameters as a number and prints which number is large.
    int LNum(int num1,int num2){
        if(num1>num2){
            return num1;

        }else{
            return num2;
        }
    }



    public static void main(String[] args) {

        LargeNumber lg = new LargeNumber();

        System.out.println(lg.LNum(65, 87));
    }
}

