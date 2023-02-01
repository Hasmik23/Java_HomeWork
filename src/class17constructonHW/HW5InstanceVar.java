package class17constructonHW;

public class HW5InstanceVar {

    /*Write a Student class that have instance variables name and address.
    Create a constructor that will initialize those variables.
    Print name & address of given student using displayInfo method.*/


    String name;
    String address;

    HW5InstanceVar(String sName, String sAddress) {
        name = sName;
        address = sAddress;
    }
     void displayInfo(){
         System.out.println("Name is "+name+"    "+"Address is "+address);

     }


}
