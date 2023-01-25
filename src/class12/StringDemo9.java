package class12;

public class StringDemo9 {
    public static void main(String[] args) {


        String str="jdnfkfd 3498234 *&%*";

        int counter=0;
            for (int i=0; c<str.length ;i++) {

                if (Character.isAlphabetic(str.charAt(i))) {   // run  14
                    //if (Character.isDigit(str.charAt(i))) { to check digits
                    counter++;
                }
            }

                    System.out.println("Total isAlphabetic in str "+counter);
                }

        }
