package lt.eimantas.app1.inheritance;

public class App {
    public static void main(String[] args) {
        Continent europa = new Continent("Europa", new Country("Lietuva"), new Capital("Vilnius"));
        System.out.println(europa);
        Continent europa2 = new Continent("Europa", new Country("Latvija"), new Capital("Riga"));
        System.out.println(europa2);
    }
}

class Continent {
    String name;
    Country country;
    Capital capital;

    Continent(String name, Country country, Capital capital) {
        this.country = country;
        this.capital = capital;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "name='" + name + '\'' +
                ", country=" + country +
                ", capital=" + capital +
                '}';
    }
}

class Country {
    Country(String name) {
    }

}

class Capital {
    Capital(String name) {}

}