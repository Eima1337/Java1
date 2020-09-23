package lt.eimantas.app1.polymorphism;

public class PolymorphicFunctionParameters {
    static void doSomethingWithPersonX(PersonX p) {
        p.doSomething();
    }
    public static void main(String[] args) {
        doSomethingWithPersonX(new PersonX());
        doSomethingWithPersonX(new EmployeeX());
        }
    }


class PersonX {
    public void doSomething() {}
}
class EmployeeX extends PersonX {}