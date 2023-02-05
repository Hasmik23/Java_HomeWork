package class19InheretanceHW;

public class classA {

    /*HW: Write program for multilevel inheritance where class C inherits from class B and
     Class B inherits from Class A.*/

    String name;
    String cName;
    String roasted;


    void printInfo() {
        System.out.println("coffee " + name + "grow in " + cName+roasted+"medium");
    }



    public static void main(String[] args) {

        classA ClassA = new classA();
        ClassA.name("Green Mountain");
        ClassA.cName("Colombia");
        ClassA.roasted("medium");
        ClassA.printInfo();
    }

    }








}
