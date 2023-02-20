package Project2;


     public class Shape {
    /*  Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimiter.
          Create 2 classes Circle & Square that implements functionality defined in the Shape Interface. Test your code. */

         void calculateArea();
         void calculatePerimiter();


     }
   class Circle extends Shape{

    double radius;
    Circle(double radius) {
        this.radius = radius;
    }

    public void calculateArea(){

        System.out.println(Math.PI*(Math.pow(radius,2)));
    }
    public void calculatePerimiter() {

        System.out.println(2 * Math.PI*radius);
    }

}

class Square extends Shape{

    double side;
    public Square(double side) {
        this.side = side;
    }
    public void calculateArea() {

        System.out.println(side * side);
    }
    public void calculatePerimiter() {

        System.out.println(4*side);
    }
}










