package class17constructonHW;

public class HW6Book {

    /*Write Book class that will have instance variables and 2 Constructors.
    While creating an object make sure:
        Instance variables are being initialized
        Both Constructors are being executed*/

    String bookName;
    String bookType;
    int bookNumber;

    HW6Book(String bookN, String bookT, int bookNum) {  //first constructor
        bookName = bookN;
        bookType = bookT;
        bookNumber = bookNum;

        System.out.println("Book name is " + bookName + "," + " Book type is " + bookType + ", " + " Book number is " + bookNumber);
    }

    HW6Book(String bookN, int bookNum) { //second instructor
        bookName = bookN;
        bookNumber = bookNum;

        System.out.println("Book name is " + bookName + " and " + "Book number is " + bookNumber);

    }
}

 /*   System.out.println(*************);
      void displayIngo(){
    System.out.println("Book name is " + bookName + "," + " Book type is " + bookType + ", " + " Book number is " + bookNumber);
}
  */





