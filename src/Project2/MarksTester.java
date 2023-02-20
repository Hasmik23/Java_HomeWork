package Project2;

public class MarksTester {
    public static void main(String[] args) {

       Marks []  mark={new studentA(87,67,54), new studentB(89,90,98,87)};

        for (Marks student:mark) {
            System.out.println(student.getPercentage()+"%");
       }
    }
}
