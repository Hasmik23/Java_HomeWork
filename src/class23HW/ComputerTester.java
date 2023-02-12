package class23HW;

public class ComputerTester {
    public static void main(String[] args) {

        Computer[] computer={new Apple(),new Lenovo(),new HP(),new Dell()};
        for (Computer comp:computer){
            comp.battery();
            comp.memory();
            comp.price();

        }
    }
}
