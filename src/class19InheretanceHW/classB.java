package class19InheretanceHW;

public class classB extends classA {

    String CMBrand;

    void print() {
        System.out.println(CMBrand + " coffee machine");


    }

    public static void main(String[] args) {
        classB ClassB = new classB();
        ClassB.name = "Dunkin Donuts";
        ClassB.cName = "USA";
        ClassB.roasted = "black";
        ClassB.CMBrand = 'Mr. Coffee";
        ClassB.printInfo();

    }
}