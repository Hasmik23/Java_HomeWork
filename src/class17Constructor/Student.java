package class17Constructor;

public class Student {

    //variables
    String name;
    String id;
    int age;
    double weight;

    //2nd construstor
    public Student(String studentName,String studentId,int studentAge) {
        name = studentName;
        id = studentId;
        age = studentAge;

        //take parameters and assign them to variables
        //1st constructor   method

        Student(String studentName,String studentId,int studentAge,double studentWeight){


            name = studentName;
            id = studentId;
            age = studentAge;
            weight = studentWeight;

        }
    }
    void printInfo(){  //method
        //we may add if condition

        System.out.println("Name "+name+" ID"+ id+"Age "+age+"Weight "+weight);
    }

}
