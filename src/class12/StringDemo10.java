package class12;

public class StringDemo10 {
    public static void main(String[] args) {


      String str="Java is not pain";


        System.out.println(str.indexOf("j"));
        System.out.println(str.indexOf("a"));
        System.out.println(str.indexOf("p"));
        System.out.println(str.indexOf("not"));
        System.out.println(str.indexOf("word"));  // if not available will bring -1

        System.out.println(str.toLowerCase().indexOf("j"));



                for (int i=0; i<str.length();i++){
            System.out.println(str.charAt(i)+" has the index "+i);
        }

    }
}
