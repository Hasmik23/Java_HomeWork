package class16;

public class StudentTester {
    public static void main(String[] args) {
        //instant variable

        Student student=new Student();  // object
        student.name="Zafar";    //variable
        student.id="123";
        student.schoolName="Syntax";
        student.age=22;
        student.weight=70;


        Student student1=new Student();
        student1.name="hamid";
        student1.id="456";
       // student1.schoolName="Syntax";
        student1.age=5;
        student1.weight=86;

        Student student2=new Student();
        student2.name="Nelson";
        student2.id="789";
       // student2.schoolName="Syntax";
        student2.age=90;
        student2.weight=86;

        //static variables
        System.out.println(student2.schoolName);
        System.out.println(student1.schoolName);
        System.out.println(student.schoolName);

    }
}
//when we create instant variable for each variable will create a seperate variable