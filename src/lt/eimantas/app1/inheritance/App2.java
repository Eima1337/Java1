package lt.eimantas.app1.inheritance;

public class App2 {
    public static void main(String[] args) {
        Machine pc1 = new Machine();
        System.out.println(pc1);
    }
}
class Machine {
    String name;
    String function;
    double price;
    Machine() {}

}
class Computer extends Machine{
    String type;
}
class Fridge extends Machine {
    String type;
}
class Laptop extends Computer {

}
class Stationary extends Computer {

}
class StationaryFridge extends Fridge {

}
class BuiltInFridge extends Fridge {

}
