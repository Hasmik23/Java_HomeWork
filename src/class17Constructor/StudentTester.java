package class17Constructor;

public class StudentTester {
    public static void main(String[] args) {

        Student AAA=new Student("AAA","67854t",20, 150);
        AAA.printInfo();
        Student BBB=new Student("BBB","65454t",21, 151);
        BBB.printInfo();
        Student CCC=new Student("CCC","62354t",22, 152);
        CCC.printInfo();
        Student DDD=new Student("DDD","65254t",23, 153);
        DDD.printInfo();
        Student EEE=new Student("EEE","61354t",24, 154);
        EEE.printInfo();


        Student FFF=new Student("AAA","67854t",20); //2nd construstor
    }



}
