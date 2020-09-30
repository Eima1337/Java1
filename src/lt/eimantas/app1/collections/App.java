package lt.eimantas.app1.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.*;

public class App {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Tomas", 28, 1000));
        employees.add(new Employee("Matas", 27, 1200));
        employees.add(new Employee("Deividas", 26, 800));
        employees.add(new Employee("Deividas", 26, 800));
        employees.add(new Employee("Tomas", 28, 1000));
        Set<Employee> uniqueEmployee = new HashSet<>(employees);
        System.out.println(uniqueEmployee);
        ArrayList<Employee> uniqueEmployees = new ArrayList<>();
        for (int i = 0; i < employees.size(); i++) {
            if(employees.get(i).equals(employees.get(i + 1))) {
                System.out.println("Nelygus");
            } else {
                uniqueEmployees.add(employees.get(i));
            }
        }
        System.out.println(uniqueEmployee);
//        Queue<Employee> priorityEmployee = new PriorityQueue<>(employees);
//        System.out.println(priorityEmployee);
    }
}

class Employee {
    private String name;
    private int age;
    private int salary;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (age != employee.age) return false;
        if (salary != employee.salary) return false;
        return name != null ? name.equals(employee.name) : employee.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + salary;
        return result;
    }
}