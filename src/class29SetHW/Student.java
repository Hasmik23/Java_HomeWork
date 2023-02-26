package class29SetHW;

import java.util.HashMap;

public class Student {
    public static void main(String[] args) {
        /* Create a Set collection that will hold Objects of Student Type.
          In this set we do not care about the insertion order.
          Each student object should have name and studentID. Display name of each student.*/

        HashMap<String,Integer> student=new HashMap<>();
        student.put("Sami",1234);
        student.put("Lina",2345);
        student.put("Tina",3456);
        student.put("goerge",5678);

        System.out.println(student);


    }
}
