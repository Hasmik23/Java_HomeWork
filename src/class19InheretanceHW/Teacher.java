package class19InheretanceHW;

/* Write a Java program called Teacher.  Identify features and 4 behaviour of that Class.
Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would
have it their own features and behaviour. Test all 4 classes */

public class Teacher {

    String name;
    String grade;
    String subject;
    int hours;
    int yearsExp;


    void teacher() {
        System.out.println("My name is " + name + " I am a " + grade + " teacher for " + hours + " hours");
    }


    void experience() {
        System.out.println("My name is " + name + " I have" + yearsExp + " years experience");
    }


    void subject() {
        System.out.println("My name is " + name + " I teach " + subject);
    }


    void grade() {
        System.out.println("My name is " + name + " highest grade is " + grade);
    }

}










