package class20HW;

public class Employee {
    /*Create an Employee class that will have variables and methods. Constructor that should initialize
    instance variables.
Create 2 subclasses FullTime and PartTime Employees that should have own variables and methods.
Create a Tester Subclass from FullTime Employee and add some features and methods to the Tester Class.
Test your code!*/

    String name;
    String ID;
    int years;

    Employee(String name,String ID,int Years) {
        this.name = name;
        this.ID = ID;
        this.years = years;
    }

        void employee(){
            System.out.println("Name "+name+"  ID "+ID+"  years"+years);
        }
    }



    class FullTime extends Employee(){
       int fThrs;

   FullTime(String name,String ID,int Years, int fThrs){
        super(name,ID,years);
        this.fThours=fThours;
    }
    void benefits(){
        System.out.println("Full time employee qualifies for full benefits");

        void daysOff(){
        System.out.println(Full time employee elegible for certain amount of personal and sick days");
        }
        }




    class PartTime extends Employee(){
        int pTHrs;

    PartTime(String name,String ID,int Years, int pThrss){
        super(name,ID,years);
        this pTHrs=pTHrs;

        void benefitInfo(){
        System.out.println("Part time employee does not qualify for benefits");
        }
        }



public class FullTimeTester {
    public static void main(String[] args) {
        FullTime ft=new FullTime("jack", 8765, 12,40 );
      //  ft.benefits();
       // ft.dayOff();

    }



            }




