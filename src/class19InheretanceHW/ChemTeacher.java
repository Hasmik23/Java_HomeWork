package class19InheretanceHW;

public class ChemTeacher extends Teacher{

    String experiment;

    void experiment() {
        System.out.println("Today's experemint is "experiment);
    }


    public static void main(String[] args) {

        ChemTeacher CT = new ChemTeacher();
        CT.name = "Brian";
        CT.hours = 10;
        CT.yearsExp = 16;
        experiment();
        teacher();
        grade();

    }
}


