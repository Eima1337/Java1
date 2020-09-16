package lt.eimantas.app1;

class Person {
    private String name;
    private String surname;
    private int age;
    Person() {}
    Person(String n, String s, int a) {
        this.name = n;
        this.surname = s;
        this.age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class Task {
    public static void main(String[] args) {
        Person as = new Person();
        as.setName("Eima");
        as.setSurname("Bakevicius");
        as.setAge(28);
        System.out.println("Vardas : " + as.getName() + ", pavarde: " + as.getSurname() + ", amzius: " + as.getAge());
    }
}
