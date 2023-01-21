package class8;

public class ContinueKeywordDemo1 {
    public static void main(String[] args) {

        for (int i =0; i < 10; i++){

            if(i%3==0) {  // if this false jump to print i  and Hello World
                continue; // skip,  continue ignores after continue goes back to for()
            }else{
                System.out.println(i);

            }
            System.out.println("Hello World");
        }
        for (int a =0; a < 10; a++){ //continue and break need IF CONDITION

            if(a==3||a==6||a==9){  // if this false jump to print i  and Hello World
                continue; // skip,  continue ignores after continue goes back to for()
            }
            System.out.println(a);// line is never execute when i=3,6,9
        }





        }
        }


