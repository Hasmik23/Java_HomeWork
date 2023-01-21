package class10;

public class ForEachLoopDemo3 {
    public static void main(String[] args) {

        // Limitation of Foreach Loop
        int[] arr = {10,13, 20, 30, 45, 50};

        // using forEach loop can't update the elements because we don't have access to the index.
        // we can read the data and print it

        for(int x:arr){   // directly access
            if(x%2!=0){
                x=0;   //can't do because no index !!?
            }
        }



        }
    }


