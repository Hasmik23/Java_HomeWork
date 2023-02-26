package class29SetHW;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Cities {
    public static void main(String[] args) {
        /*Create a Set of cities in which you want to make sure that insertion order is
        maintained.Then remove any city that starts with “A”;*/

        LinkedHashSet<String> cities = new LinkedHashSet<>();
        cities.add("Annapolis");
        cities.add("Yerevan");
        cities.add("Alexandria");
        cities.add("Baghdad");
        System.out.println(cities);

        
        Iterator<String> iterator = new Iterator<String>();

         while (iterator.hasNext()) {
            String s = iterator.next();
            if (s.startsWith("A") || s.startsWith("a")) {
                iterator.remove();
            }
        }
        System.out.println(cities);

        //lambda expression/Teacher
        // cities.removeIf(  -> x.startsWith("A"));
    }
}







