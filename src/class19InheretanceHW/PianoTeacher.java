package class19InheretanceHW;

public class PianoTeacher extends Teacher {

    String instrument;

    void instrument() {
        System.out.println("I love playing on "+instrument);
    }


    public static void main(String[] args) {

       PianoTeacher PT = new PianoTeacher();
        PT.name = "Emmy";
        PT.hours = 115;
        PT.yearsExp = 20;
        instrument();
        teacher();
        grade();

    }
}


