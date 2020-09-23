package lt.eimantas.app1._1_interface;

public class App {
    public static void main(String[] args) {
        Bank bank1 = new Bank(1000, 3, "sarkuvos g 20");
        bank1.print();
    }
}

interface Printable {
    void print();
}

class Bank implements Printable {
    int totalAmount;
    int employeeCount;
    String adress;

    public Bank(int totalAmount, int employeeCount, String adress) {
        this.totalAmount = totalAmount;
        this.employeeCount = employeeCount;
        this.adress = adress;
    }

    @Override
    public void print() {
        System.out.println("Money: " + totalAmount + " , employee count: " + employeeCount + " , adress: " + adress);
    }
}