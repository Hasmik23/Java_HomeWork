package class28ArrayListHW;

import java.util.ArrayList;

public class HW2 {
    public static void main(String[] args){

        //2) Create an arraylist of cars and retrieve all the values using 3 different ways.

        ArrayList<String> cars=new  ArrayList<>();
        cars.add("Toyota");
        cars.add("GMC");
        cars.add("Corvit");
        cars.add("Ford");
        cars.add("VW");
        System.out.println(cars);

        System.out.println("------------");
        for(String car:cars){
            System.out.println(car);

            System.out.println("------------");
            for(int i=0;i<cars.size()){
                System.out.println(cars.get(i);
            }

        }
    }
}
