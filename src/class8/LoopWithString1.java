package class8;

public class LoopWithString1 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++){      //outer for loop


        for (int j = 0; j < 5; j++){        //inter for loop
            System.out.println("i = "+i+" j = "+j);
        }
            System.out.println("************");//will print this line after execute j 5 times
        }
        System.out.println("end loop");//will print this line after execute i 5 times




      /*  for (int i = 0; i < 5; i++){//outer for loop


            for (int j = 0; j < 5; j++){//inter for loop, run 5 times
                System.out.println(j);
            }
            System.out.println("************");
        } */


    }
    }

