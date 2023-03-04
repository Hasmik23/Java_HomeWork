package class30HW;

import java.util.LinkedHashSet;
import java.util.Set;

public class HW4Unique {
    public static void main(String[] args) {
        /*Create the collection that will store single uniques Objects of a String type in which order is preserved.
          Write a logic to concatenate all string from the collection.*/

        Set<String> str = new LinkedHashSet<>();
        str.add("School");
        str.add("Home");
        str.add("Stadium");
        str.add("Feild");

        String concat = "";
        for (String s : str) {
            concat += s;
        }

        System.out.println(concat + " ");
    }
}
