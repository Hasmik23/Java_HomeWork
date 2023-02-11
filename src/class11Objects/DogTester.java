package class11;
 /* ObjectOrientedProgramming  is nothing but some set of rules that if we follow, we achieve below.
   1)Representing real life entities becomes easier.
   2)Code repetition is minimized.
   3)Changing existing code and adding new features becomes easier.
   4)Helps us write secured code.*/

import java.util.Scanner;

public class DogTester {    // High level programming
    public static void main(String[] args) {

       // Scanner scanner = new Scanner(System.in); // creating an actual object from class scanner
        //Scanner.next();
        Dog jacky = new Dog();    //This is how to create the objects of a class. Dog is name of class
        // Cat cat=new Cat();    //Comp doesn't accepted because we haven't defined the cat in the comp or in this project
        jacky.bark();   //gets result from file Dog print out is "woof Woof"


    }
}
