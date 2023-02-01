package class15HW;

public class Hello {

    /* Create a method that will say Hello in different language based on the country that will passed when method is executed

    return type >= String void
    name >= sayHello
    parameter >= String countryName
        */

    String sayHello(String countryName) {  // void takes input countryName

        switch (countryName) {
            case "Iraq":
                return "Marhaba";  //breake is not needed when we use return keyword. return means get out
            case "USA":
                return "Hi";
            case "France":
                return "Bonjour";
            case "Armenia":
                return "Parev";
            case "Italy":
                return "Ciao";
            default:
                return "Country not supported";

        }
      //  System.out.println("I will get an error");   will never be executed because return is last statement


        }


        public static void main(String[] args){
            Hello hl = new Hello();
            System.out.println(hl.sayHello(Armenia));
        }
    }




