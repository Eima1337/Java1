package lt.eimantas.app1.polymorphism;

import java.util.Arrays;

public class PolymorphicArrays {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("Ignas");
        people[1] = new Employee(); //example of polymorphism
        people[1].setName("Tomas");
        people[2] = new Janitor();
        people[2].setName("Deividas");

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getName());
        }
        for (Person name : people) {
            System.out.println(name);
        }
        System.out.println(Arrays.toString(people));
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }
    public Person(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People {" + "name: " + name + "}";
    }
}

class Employee extends Person {

}
class Janitor extends Employee {

}