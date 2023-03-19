package class33HW;

public class HW4 {


        /*Create a method checkUserName that will throw a runtime exception.
        Method should throw an exception when entered username is less than 5 characters.*/

        public static void checkUserName(String userName) {
            if (userName.length() < 5) {
                throw new RuntimeException("entered username is less than 5 characters");
            } else {
                System.out.println("Entered user name is valid");
            }

        }

    public static void main(String[] args) {

            String userName="Avb";
            try{
                checkUserName(String userName);
            }catch(RuntimeException e){
        System.out.println("Exception caught: " + e);

    }
}
