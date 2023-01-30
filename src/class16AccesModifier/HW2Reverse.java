package class16AccesModifier;




public class HW2Reverse {

     /*Create a method that will take a String as a parameter and returns reversed String.
     Method should be available to all classes within your project and accessible by class name.

    return type >= String
    name >= ReversedString
    parameters >= String
    access modified >= public
     */

    public String ReverseStr(String input){
             String newStr="";
    For(int i=input.length-1;i>=0;i--){
        newStr=input.charAt(i);


        }

        return newStr;
    }

    String reverseStr1(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    String reverseStr2(String input) {
        StringBuilder stringBuilder = new StringBuilder(input);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}




