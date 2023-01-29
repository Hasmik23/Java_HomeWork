package class15HW;

public class Palindrome {

    package class15HW;

    public class palindrome{

        String str(String){
            //reverse the word
            String reverse="";
            For(int i=str.length;i>=0;i--){
                reverse+= str().charAt(i);
                return reverse;
            }
            boolean palindrome=true;
            for(i=0;i<str().length();i++) {
                if (str.charAT(i) != reverse.charAt(i)) {
                    palindrome = false;
                }
            }
            if (palindrome){
                return true;
            }else{

                return false;

            }

        }


        public static void main(String[] args) {

            Pdrome PD=new Pdrome();
            System.out.println(PD.Palindrome("Raddar"));

        }

    }


  */  boolean isPalindrome(String word) {
        boolean isPalindrome=true;
        String reverse = new StringBuilder(word).reverse().toString();
        if (word.equals(reverse)) {
            return true;
        }else {
            return false;
        }

    }

    public static void main(String[] args) {
        Task3 task3=new Task3();
        System.out.println(task3.isPalindrome("hello"));
    }
}
        */


