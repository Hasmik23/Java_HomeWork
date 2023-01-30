package class16AccesModifier;

public class H3Vowels {

    /* Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
       Method should be available inside the class only where it was declared and executed by calling it is name.

     return type >= String
    name >= VowelString
    parameters >= String
    access modified >= private
        */

    private String VowelString(String Str){
        return Str.replaceAll=("[aeoiu]",""));

    }



    public static void main(String[] args) {

        H3Vowels vowel=new H3Vowels();
        System.out.println(vowel.VowelString("America"));



    }
}

