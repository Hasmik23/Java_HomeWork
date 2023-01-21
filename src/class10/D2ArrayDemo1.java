package class10;

public class D2ArrayDemo1 {
    public static void main(String[] args) {

        int[][] matrix= {  {10, 20, 30},
                           {55, 22, 45, 50},
                           {100, 220, 450}
        };
      //  System.out.println(matrix[1][1]);

       // matrix[0].length;  // matrix length=0

        for(int i=0;i<matrix.length;i++){
            for(int j=0;i<matrix[i].length;i++){
                System.out.println(matrix[i][j]+" ");
            }

        }
    }
}
