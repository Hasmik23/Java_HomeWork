package class33HW;

public class HW3AgeEligibility {


       /* Create a method to check age eligibility that will throw a runtime exception.
       Method should throw an exception age is less than 16. */

    public void checkAgeEligibility(int age) {
        if (age < 16) {
            throw new RuntimeException();
            System.out.println("Age is less than 16");

        }
    }



    public static void main(String[] args) {
           int age=14;
          try {
                   checkAgeEligibility(age);
               } catch (RuntimeException e) {
                   System.out.println("Exception caught: " + e.getMessage());
           }
    }
}
