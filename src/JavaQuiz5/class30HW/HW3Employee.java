package class30HW;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HW3Employee {
    public static void main(String[] args) {
        /*Create a Map that will store Employee name and salary. Write a logic to retrieve an employee who gets the highest salary. Output should be in the below format
           John Smith=$100000*/

        Map<String, Double> employee=new HashMap<>();
        employee.put("AA",76.56);
        employee.put("BB",65.34);
        employee.put("CC",45.32);
        employee.put("DD",98.65);

        Set<Map.Entry<String, Double> set=employee.entrySet();
        String name="";
        int hSalary=0;
        for (Map.Entry<String, Double> emp: employee.entrySet()){
            if(Map.Entry.getValue()>hSalary){
                name=Map.Entry.getKey(0);
                hSalary=Map.Entry.getValue();
            }
        }
        System.out.println(name+"=$"+hSalary);


    }
}


