package class12;

public class StringDemo11 {
    public static void main(String[] args) {
        
        String str="Send it to support channel.More ";
        //We can return from this point
         String newStr=str.substring(28);  // counts spaces
      // String newStr=str.substring(5);   run   from 5th digit
        System.out.println(newStr);
        
        // we can also specify the starting and ending pointsout

        System.out.println(str.subString(0,27)); // run    from 0 to 27
        
        
    }
}
