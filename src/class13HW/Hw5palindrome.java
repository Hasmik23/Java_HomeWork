package class13HW;

public class Hw5palindrome {
    public static void main(String[] args) {
        /*How would you check if String is palindrome or not? aba=> true
              =>false*/

        String str = "aba";
        StringBuffer buffer = new StringBuffer(str);
        buffer.reverse();
        String data = buffer.toString();

        if(str.equals(data)){
            System.out.println("Given String is palindrome");
        }else {
            System.out.println("Given String is not palindrome");
        }

    }
}


