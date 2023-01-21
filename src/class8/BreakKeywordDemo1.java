package class8;

public class BreakKeywordDemo1 {
    public static void main(String[] args) {

        boolean summer=true;
        int temp=75;

        while (summer){

            if(temp<=100){
                System.out.println("I love summer because temprature is "+temp);
            }
            else{
                System.out.println("It's very hot");
                break;
            }
            temp+=5;
        }
        //Create below program without break keyword


        System.out.println("*******");
        boolean summer1=true;
        int temp1=75;

        while (summer1){

            if(temp1<=100){
                System.out.println("I love summer because temprature is "+temp1);
            } else{
                summer1=false;
                System.out.println("It's very hot");//not stop printing
                            }
            temp1+=5;
        }


      /*  int temp2=75;

        while (temp2<=105) {

            if (temp2 <= 100) {
                System.out.println("I love summer because temprature is " + temp2);
            } else {
                System.out.println("It's very hot");//not stop printing
            }
            temp2+= 5;
        }

        for (i=75;i<=100;I+=5){
            System.out.println("It's hot");
        }
        System.out.println("It's very hot");*/


    }

}


