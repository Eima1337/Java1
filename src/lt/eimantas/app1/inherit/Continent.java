package lt.eimantas.app1.inherit;

public class Continent {
    public static void main(String[] args) {
        Cont europa = new Cont();
    }
}

class Capital {

}

class Country {
    public void Cont() {
        Country country = new Country();
    }
}

class Cont {
    private String name;
    private String surrOcean;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurrOcean() {
        return surrOcean;
    }

    public void setSurrOcean(String surrOcean) {
        this.surrOcean = surrOcean;
    }
}

