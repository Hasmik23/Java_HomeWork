package class13;

public class ReplaceDAllMethoDemo {
    public static void main(String[] args) {

        String str="BFGHJFZMYDtyhgfdf765436789^%$@#^&*(*&";

        // replaces upper case letters

        System.out.println(str.replaceAll("[A-k]","#"));
        System.out.println(str.replaceAll("[A-Z]","#"));

        // replace lower case letters
        System.out.println(str.replaceAll("[a-z]","#"));

        // replace numbers
        System.out.println(str.replaceAll("[0-9]","#"));


        System.out.println(str.replaceAll("[A-Za-z]","#"));

        System.out.println(str.replaceAll("[A-Za-z0-9]","#"));

        System.out.println(str.replaceAll("[^A-Za-z0-9]","#"));  //^ do not replace

        System.out.println(str.replaceAll("[A-Za-z0-9]","")); //remove




    }
}
