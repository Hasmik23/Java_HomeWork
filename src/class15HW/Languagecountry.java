package class15HW;

public class Languagecountry {

   /* Create a method that will say Hello in different language based on the country
    that will passed when method is executed
    */
    String helloCountry(String country){
        switch (country.toLowerCase()){
            case "Iraq":
                return "Marhaba";

            case "USA":
                return "Hi";

            case "French":
                return "Bonjoor";

            case "Armenia":
                return "Parev";

            default:
                return "country is unknown";
        }
    }

    public static void main(String[] args) {
        Languagecountry lang=new Languagecountry();
        System.out.println(lang.helloCountry("Armenia"));
    }
}

