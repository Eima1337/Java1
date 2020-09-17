package lt.eimantas.app1.suniai;

public class Dog {
    private String veisle;
    private String name;

    Dog(String v, String n) {
        this.veisle = v;
        this.name = n;
    }

    Dog() {
    }

    public String getVeisle() {
        return veisle;
    }

    public void setVeisle(String veisle) {
        this.veisle = veisle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
