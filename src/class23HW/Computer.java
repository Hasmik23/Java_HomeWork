package class23HW;

public class Computer {


    /*Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
Define common behavior within and some fields in parent class and override some of the methods in child classes
Define some methods specific to child classes
Create objects of child classes and store them into array. Loop through each object and execute available methods.*/

    public void processor(){
        System.out.println("processor");
    }

    public void memory() {
        System.out.println("memory");
    }

    public void battery() {
        System.out.println("Battery");
    }

    public void price() {
        System.out.println("price");
    }
}


class Apple extends Computer{
    @Override
    public void processor() {
        System.out.println("Apple MI chip");;
    }

    @Override
    public void memory() {
        System.out.println("8GB");
    }

    @Override
    public void battery() {
        System.out.println("Apple has long last battery");
    }

    @Override
    public void price() {
        System.out.println("High price");
    }
}

class Lenovo extends Computer{
    @Override
    public void processor("Intel Xeon E5-2620") {

    }

    @Override
    public void memory() {
        System.out.println("8GB memory");
    }
}

class HP extends Computer{
    @Override
    public void memory() {
        System.out.println("12GB memory");
    }

       @Override
    public void price() {
        super.price("nice price");
    }

   /* public void Screen(){
        System.out.println("Touch screen");
    }*/
}

class Dell extends Computer{
   /*public void displaySize(){
       System.out.println("15.6 inches");
    }*/

       @Override
    public void battery() {
           System.out.println("Long hours last");
    }

    @Override
    public void price() {
        System.out.println("Affordable");
    }
}
