package class17Constructor;

public class Dog {

    String name;
    String breed;
    String color;
    int age;
    double weight;


    // CONSTRUCTORS HAS NO NAME, WILL SAME CLASS NAME ex  Dog(){

    Dog(String dogName, String dogBreed, String dogColor, int dogAge, double dogWeight) {
        name = dogName;
        breed = dogBreed;
        color = dogColor;
        age = dogAge;
        weight = dogWeight;



    }
    void printInfo(){
        System.out.println("Name "+name+" Breed"+ breed+"age "+age+"Weight "+weight);
    }
}
