package class17constructonHW;

public class HW3Constructors {

     /* Write a java class that have 4 constructors with 4 different access levels of constructors
    (private,public,default,protected) and create 4 objects of this class:
    1 - inside same class; 2 - from outside the class;
    3 - from different class inside different package  and observe result.*/

    String name;
    String id;
    int age;



    HW3Constructors(){
      }


    public HW3Constructors(String sName) {
        name = sName;
        System.out.println("Name is "+name);
    }


    private HW3Constructors(int sAge){
        age=sAge;
        System.out.println("Age is "+age);
    }


    protected HW3Constructors(String sName,String sId,int sAge){
        name = sName;
        id=sId;
        age=sAge;
        System.out.println("Name "+name+"    ID"+ id+"   Age "+age);

    }
}

