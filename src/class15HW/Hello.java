package class15HW;

public class Hello {

    /*Create a method that will say Hello in different language based on the country that will passed when method is executed*/

    String hellolanguage(String country) {

        switch (country) {
            case "Iraq":
                return "Marhaba";
            case "USA":
                return "Hi";
            case "France":
                return "Bonjour";
            case "Armenia":
                return "Parev";
            case "Italy":
                return "Ciao";


        }


        public static void main (String[]args){
            Hello hl = new Hello();
            System.out.println(hl.hellolanguage(Armenia));
        }
    }
}



