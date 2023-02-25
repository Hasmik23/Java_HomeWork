package class28ArrayListHW;

import java.util.ArrayList;
import java.util.Iterator;

public class HW3 {
    public static void main(String[] args) {
        /*3) create an arrayList of words. Remove every word that ends with “e”.*/

      ArrayList<String> words=new ArrayList<>();
      words.add("five");
      words.add("weather");
      words.add("three");
      words.add("house");
      words.add("sun");

        Iterator<String> iterator = words.iterator();

        while (iterator.hasNext()) {
            String s = iterator.next();
            if (s.endsWith("e")) {
                iterator.remove();

            }
        }
        System.out.println(words);





    }
}
