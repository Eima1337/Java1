package lt.eimantas.app1.static_vs_instance;

public class App {
    public static void main(String[] args) {
        Person.age = 15;
        System.out.println(Person.age);
        Person.age = 20;
        System.out.println(Person.age);

        Person p1 = new Person();
        p1.age = 23;
        System.out.println(p1.age);
        Person p2 = new Person();
        p2.setAge(99);
        System.out.println(p1.getAge());
        System.out.println(p2.getAge());

    }
}
class Person {
    static int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        Person.age = age;
    }
}
