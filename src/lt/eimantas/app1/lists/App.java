package lt.eimantas.app1.lists;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("string1");
//        strings.remove(0);
        strings.contains("str");
        System.out.println(strings);
        System.out.println(strings.contains("str"));
    }
}
