package class33HW;

import java.util.LinkedList;
import java.util.List;

public class HW2 {
    public static void main(String[] args) {
        /* Create a static method that will return a List of Exceptions.
           Inside your method create objects of 4 exception classes using try and catch blocks
           and store them inside your list.
           Call your method inside main and print name and details of all Exception objects */

        public static List<Exception> createExceptionList () {
            List<Exception> listOfExceptions = new LinkedList<>();
            try {
                System.out.println(10 / 0);
            } catch (ArithmeticException e) {
                System.out.println("division by zero exception");
                listOfExceptions.add(e);
            }

            try {
                String name = null;
                System.out.println(name.length());
//run null point exception
            } catch (NullPointerException npe) {
                System.out.println("We are trying to access to method on a null object");
            }
        }
    }}

/* public static List<Exception> createExceptionList() {
        List<Exception> exceptionList = new ArrayList<>();
        try {
            int[] arr = new int[5];
            arr[10] = 10; // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            exceptionList.add(e);
        }

        try {
            String str = null;
            System.out.println(str.charAt(0));
        } catch (NullPointerException e) {
            exceptionList.add(e);
        }

        try {
            int num = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            exceptionList.add(e);
        }

        try {
            Object obj = new String("hello");
            Integer integer = (Integer) obj;
        } catch (ClassCastException e) {
            exceptionList.add(e);
        }

        return exceptionList;
    }

    public static void main(String[] args) {
        List<Exception> exceptionList = createExceptionList();

        for (Exception e : exceptionList) {
            System.out.println("Exception: " + e.getClass().getSimpleName());
            System.out.println("Details: " + e.getMessage());
            System.out.println();
        }
    }
}
*/


