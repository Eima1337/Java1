package lt.eimantas.app1.composition_and_inheritance;

public class App {
    public static void main(String[] args) {
        Person p1 = new Person(15, "Lola");
        Person p2 = new Person(14, "oala");
        System.out.println(p1);
        Employee e1 = new Employee(14, "Jons", 1);
        System.out.println(e1);
        Janitor j1 = new Janitor(16, "Petras", 2, new Broom(200));
        System.out.println(j1);
    }
}
class Person {
    private int age;
    private String name;
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
class Employee extends Person {
    private int badgeId;
    public Employee(int age, String name, int badgeId) {
        super(age, name);
        this.badgeId = badgeId;
    }

    public int getBadgeId() {
        return badgeId;
    }

    @Override
    public String toString() {
        return "Employee{badge id : " + "badgeId=" + badgeId + ", name : " + this.getName() + ", age : " + this.getAge() + "}";
    }
}
class Janitor extends Employee {
    private Broom broom;

    public Janitor(int age, String name, int badgeId, Broom broom) {
        super(age, name, badgeId);
        this.broom = broom;
    }

    public Broom getBroom() {
        return broom;
    }

    public void setBroom(Broom broom) {
        this.broom = broom;
    }

    @Override
    public String toString() {
        return "{ name : " + this.getName()
                + ", age: " + this.getAge()
                + ", badgeId : " + this.getBadgeId()
                + ", broom : " + this.broom + " }";
    }
}
class Broom {
    private double price;

    public Broom(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Broom{" +
                "price=" + price +
                '}';
    }
}