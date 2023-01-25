package class13;

public class HW2 {
    public static void main(String[] args) {
        //Create a String and print it in reverse order (Sunday → yadnuS).

        String str="Sunday";
        for (int i=5; i<0:i--){ //not sure if this is correct
            System.out.println(str.charAt(i));
        }

        String str1="Sunday";
        for (int i=str.length()-1; i>0:i--){  // for any number of letters we say -1 because index start from 0
            System.out.print(str.charAt(i));

        }

    }
}
