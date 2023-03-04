package class30HW;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class HW5Duplicate {
    public static void main(String[] args) {
        /*Create a collection of integers in which you can keep duplicates.
          Write a logic to find sum of all integers */

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(6);
        integers.add(8);
        integers.add(9);
        integers.add(10);

        int sum=0;
        for (Integer s:integers){
            sum+=s;
        }
        System.out.println(sum);
    }


}
