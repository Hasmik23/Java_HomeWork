package class30HW;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HW2Person {
    public static void main(String[] args) {
    /*Create a Person class with following private fields: name, lastName, age, salary.
      Variables should be initialized through constructor. Inside the class also create a method to print user details.
      In Test Class create a Map that will store key in ascending order. In that map store personId and a Person Object.
       Print each object details.*/


        private String name;
        private String lastName;
        private int age;
        private double salary;

      public HW2Person(String name, String lastName, int age, double salary){
            this.name = name;
            this.lastaname = lastName;
            this.age = age;
            this.salary = salary;

            public String getName () {
                return name;
            }

            public String getlastName () {
                return lastName;
            }

            public int getAge () {
                return age;
            }

            public double getSalary () {
                return salary;
            }

            void userDetails () {
                System.out.println(name + " " + lastName + " " + age + " " + salary);
            }
        }

        class test {
            public static void main(String[] args) {

                Map<Integer, HW2Person> person = new TreeMap<>();
                person.put(1, new HW2Person("AA", "Aa", 23, 45.80));
                person.put(2, new HW2Person("BB", "Bb", 54, 54.67));
                person.put(3, new HW2Person("CC", "Cc", 34, 98.80));
                person.put(4, new HW2Person("DD", "Dd", 44, 78.50));

                Set<Map.Entry<Integer, HW2Person>> objects = person.entrySet();
                for (Map.Entry<Integer, HW2Person> info : objects) {
                    info.getValue().userDetails();


                }

            }
        }
    }
}

