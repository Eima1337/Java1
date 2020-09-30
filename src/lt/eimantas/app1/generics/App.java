package lt.eimantas.app1.generics;

public class App {
    public static void main(String[] args) {
        Pair pairOfStrings = new Pair("Petras", "Jonas");
        System.out.println(pairOfStrings);
        PairWGenerics<Boolean, Integer> PairWGenerics1 = new PairWGenerics<>(true, 20);
        System.out.println(PairWGenerics1);
    }
}

class Pair {
    private String first;
    private String second;

    public Pair(String first, String second) {
        this.first = first;
        this.second = second;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "{" +
                "first='" + first + '\'' +
                ", second='" + second + '\'' +
                '}';
    }
}

class PairWGenerics<F, S> {
    private F first;
    private S second;

    public PairWGenerics(F first, S second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "{" +
                "first='" + first + '\'' +
                ", second='" + second + '\'' +
                '}';
    }
}