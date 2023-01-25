package class13;

public class StringRecap {

    public static void main(String[] args) {
        //How can I print all the letters from this String one by one

        String str="Java is great";
        for (int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }

        // What is the input to the charAt() method. its int out is char

        // count how many times letter a appeared

        int count=0;
        for(int i=0; i< str.length(); i++){
            if(str.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println(count);


    }

}
