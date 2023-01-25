package class13HW;

public class Hw3 {
    public static void main(String[] args) {
        /*You have a String a= ”Is it saturday? Is it raining? Do we have a Java Class today?”
        How would you find out how many sentences are in that String?*/

        String a="Is it saturday? Is it raining?Do we have a Java Class today?";


        String [] aArr=str.split("[?]");
        System.out.println(aArr.length);
        System.out.println(aArr[0].trim());
        System.out.println(aArr[1].trim());
        System.out.println(aArr[2].trim());

    }
}
