package class30HW;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HW1 {
    public static void main(String[] args) {
        /*Create a map of Best Buy store. Place
          item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
          Retrieve all keys and values from a Best Buy map using EntrySet.*/

        Map<Integer, String> bestBuy = new HashMap<>();

        bestBuy.put(111, "Tv");
        bestBuy.put(222, "LopTop");
        bestBuy.put(333, "PC");
        bestBuy.put(444, "Speaker");


        Set<Map.Entry<Integer, String>> entrySet = bestBuy.entrySet();

        for (Map.Entry<Integer, String> entry : entrySet) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}


