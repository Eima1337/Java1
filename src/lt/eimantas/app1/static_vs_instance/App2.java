package lt.eimantas.app1.static_vs_instance;

public class App2 {
    public static void main(String[] args) {
        System.out.println(StaticCalc.add(4, 5));
        System.out.println(StaticCalc.subtract(4, 5));
        System.out.println(StaticCalc.multiply(4, 5));
        System.out.println(StaticCalc.divide(10, 5));
        System.out.println((new NonStaticCalc()).add(8, 9));
        NonStaticCalc nsc = new NonStaticCalc();
        System.out.println(nsc.add(5, 11));
        System.out.println((new NonStaticCalc()).subtract(137, 95));
        System.out.println((new NonStaticCalc()).multiply(22, 30));
        System.out.println((new NonStaticCalc()).divide(99, 33));
    }
}
class StaticCalc {
    public static int add(int i, int j) {
        return i + j;
    }
    public static int subtract(int i, int j) {
        return i - j;
    }
    public static int multiply(int i, int j) {
        return i * j;
    }
    public static int divide(int i, int j) {
        return i / j;
    }
}
class NonStaticCalc {
    public int add(int i, int j) {
        return i + j;
    }
    public int subtract(int i, int j) {
        return i - j;
    }
    public int multiply(int i, int j) {
        return i * j;
    }
    public int divide(int i, int j) {
        return i / j;
    }
}