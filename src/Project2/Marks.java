package Project2;

public class Marks {
    /*We have to calculate the average of marks obtained in three subjects by student A and by
      student B. Create class 'Marks' with an abstract method 'getPercentage' that will be returning
      the average percentage of marks. Provide implementation of abstract method in classes
      'A' and 'B'. The constructor of student A takes the marks in three subjects as its parameters and
      the marks in four subjects as its parameters for student B. Test your code*/

    double prog;
    double math;
    double chem;

    public Marks(double prog, double math, double chem) {
        this.prog = prog;
        this.math = math;
        this.chem = chem;
    }

    abstract double getPercentage();

    }

    class  studentA extends Marks{

        public studentA(double prog, double math, double chem){
          super(prog,math,chem);
    }

    double getPercentage() {
        return (prog + math + chem) / 3;
    }
}

     class studentB extends Marks{
        double phys;

       public studentB(double prog,double math,double chem, double phys){
         super(prog,math,chem);
         this.phys=phys;
    }

        double getPercentage(){
        return(prog+math+chem+phys)/4;

    }
}
