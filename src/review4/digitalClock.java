package review4;

public class digitalClock {
    public static void main(String[] args) {


        for (int i = 0; i <= 2; i++) {                  //1st digit of hour
            for (int j = 0; j <= 3; j++) {              // 2nd digit of hour
                for (int k = 0; k < 6; k++) {               //1st digit of minute
                    for (int l = 0; l <= 9; l++) {          //2nd digit of minute
                        for (int m = 0; m < 6; m++) {            //1st digit of second
                            for (int K = 0; K <= 9; l++) {        //2nd digit of second
                                for (int n = 0; n <= 9; n++) {
                                    System.out.println(i + "" + j + ":" + k + "" + l + ":" + m + "" + n);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}


        //System.out.println("*****");

      /*  for (int i = 0; i <= 2; i++) {        //hours 2 digits   00
            for (int j = 0; i <= 3; i++) {    // :
                for (int m = 0; m <= 59; m++) {
                    for (int m1 = 0; m1 <= 59; m1++) {
                        System.out.println(i + " " + j + ":" + m + ":" + m1);
                    }
                }
            }
        }*/











