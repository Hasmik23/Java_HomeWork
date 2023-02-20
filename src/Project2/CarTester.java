package Project2;

public class CarTester {
    public static void main(String[] args) {

        Car[] car={new sedan(8000,"white", 22), new truck(3000,"Blue",2000)};
        for (Car c:car){
             System.out.println(c.calculateSalePrice());


             /*or

            sedan sd=new sedan(8000,"white", 22);
            System.out.println(sedan.calculateSalePrice());

            truck tr=new truck(3000,"Blue",2000);
            System.out.println(tr.calculateSalePrice());*/

        }
    }
}


