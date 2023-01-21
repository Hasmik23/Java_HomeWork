package class11HW;

public class grades2D {
    public static void main(String[] args) {

        /* Create a 2D array(shorter way) in which first array will consist of 4 names
           and second array will contain grades.
           Then your program should print name of the students that has A and B grade */


        String[][] Grades ={{"Robert", "Jack", "Sam", "Luna"},{"B","C","A","B"}};

        for (int i=0;i<Grades[0].length;i++){
        for (int j=0;j<Grades[0].length;i++){
            if (Grades[i][j].equals("A") || Grades[i][j].equals("B")){
                System.out.println(Grades[0][j]);


            }
            }
        }


    }
}
