package class16AccesModifier;

public class HW1Sum {
    /*Create a method that will accept an array as parameters and will return a sum of all elements from that array.
    Method should be visibly only within same package and accessible by the creating an instance of the class.

    return type >= int
    name >= sumArrayElements
    parameters >= int[] arr
    access modified >= default
     */

    int sumArrayElements(int[] array){ // static int sunArray(int[] array){

        int sum=0;
        for(int num:array){
            sum+=sum;
        }
        return sum;
    }


    public static void main(String[] args) {
        int[] arr={10,25,35,45};
      //  System.out.println(sumArrayElements(arr));// when we put static would be able to call directly
        HW1Sum sum=new  HW1Sum();

        System.out.println(sum.sumArrayElements(arr));

    }
}

