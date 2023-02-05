package class19InheretanceHW;

public class MathTeacher extends Teacher {

    String University;

    void University() {
        System.out.println(University + " University where I graduated from");
    }


    public static void main(String[] args) {

        MathTeacher MT = new MathTeacher();
        MT.name = "Tony";
        MT.hours = 5;
        MT.yearsExp = 6;
        teacher();
        grade();

    }
}
