package class8;

public class NesteDLoop {
    public static void main(String[] args) {

        for (int i=0; i < 5; i++){// outer for loop

            for (int j = 0; j<5; j++){ //inter for loop
                System.out.println(j);
            }
        }
    }
}
