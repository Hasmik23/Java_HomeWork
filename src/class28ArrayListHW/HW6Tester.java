package class28ArrayListHW;

import java.util.ArrayList;

public class HW6Tester {
    public static void main(String[] args) {

        ArrayList<HW6Insurance> insuranceList = new ArrayList<>();

        // objects of subclasses
        Car carInsurance = new Car("ABC", "Toyota");
        Pet petInsurance = new Pet("KL", "Gold");
        Health healthInsurance = new Health("FGH");

//store in ArrayList
        insuranceList.add(carInsurance);
        insuranceList.add(petInsurance);
        insuranceList.add(healthInsurance);

        for (HW6Insurance i : insuranceList) {
            i.getQuote();
            i.cancelInsurance();
        }


        LinkedList<Card> cardList = new LinkedList<>();

        Card visa = new Card(10.0, "visa");
        Card paypal = new Card(12.1, "paypal");
        Card master = new Card(11.0, "master");

        cardList.add("visa");
        cardList.add("paypal");
        cardList.add("master");

        for(Card card : CardList) {

            System.out.println("Interest rate: " + c.getInterestRate());
            System.out.println("Card type: " + c.getCardType());
        }
    }
}







