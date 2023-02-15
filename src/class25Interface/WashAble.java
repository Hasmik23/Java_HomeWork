package class25Interface;

public interface WashAble{   // file name. we don't have to put abstract keyword because its has it by default designed as a sabtract.

    void wash();         //methods we don't have to put abstract keyword because its has it by default
                         //is public by default
}
//laptop   phone   Inverted are  not really related. we don't need to create parent but Interface


        class SmartWatch implements WashAble{   //only class public because has same name as file name

           public void wash(){
              System.out.println("You can wash this smartwatch with out any issues");
}


    class Phone implements WashAble{
    }

    public void wash(){
        System.out.println("I'm Ip65 rated you can wash me");
    }

       class Inverter implements WashAble{

           public void Wash(){
        System.out.println("I'm Ip65 rated you can wash me");
    }
    }
}