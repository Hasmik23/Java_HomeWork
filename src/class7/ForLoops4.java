package class7;

public class ForLoops4 {
    public static void main(String[] args) {

        //1 2 4 5 7 8 10 11  13 14 16 17 19; we miss 3  6  9  12 15

        for (int i = 0; i < 20;i++){
            if (i % 3 != 0) {
                System.out.println(i);
            }
        }
    }
}


