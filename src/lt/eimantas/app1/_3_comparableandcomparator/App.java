package lt.eimantas.app1._3_comparableandcomparator;


import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee(22, 800),
                new Employee(23, 1000),
                new Employee(24, 700),
                new Employee(20, 500)
        };
        System.out.println("Before sorting: " + Arrays.toString(employees));
        Arrays.sort(employees);
        System.out.println("After sorting: " + Arrays.toString(employees));
    }
}

class Employee implements Comparable {
    private int age;
    private int salary;
    public Employee(int age, int salary) {
        this.age = age;
        this.salary = salary;
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
                "age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return Integer.compare(this.salary, ((Employee)o).salary);
    }
}