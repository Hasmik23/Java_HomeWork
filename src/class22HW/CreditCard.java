package class22HW;

public class CreditCard {

    /*Create a class CreditCard and define variable balance and interest.
    Create an instance method that will calculate interest based on the given balance.
    Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    Call the method by creating an object of each of the three classes.*/


    double balance;
    double interest;

    public void CreditCard(double balance, double interest) {
        this.balance;
        this.interest;
    }


    void calculate interest() {
        System.out.println("Interest = " + (balance * interest));
    }


    class Visa extends CreditCard(){
       public Visa( double balance, double interest){
        super(balance, interest);
    }
    }


    class AX extends class22.CreditCard(){
    public AX( double balance, double interest){
    }
    }


    @Override
    void calculateInterest() {
        System.out.println("The interest  with AX might be higher then others " + balance * interest / 100);
    }



        public static void main(String[] args) {

            CreditCard cd = new CreditCard(2000, 0.15);
            cd.calculateInterest();

            Visa v = new Visa(4673, 0.08);
            v.calculateInterest();

            AX ax = new AX(7654, 0.10);
            ax.calculateInterest();

        }
    }



