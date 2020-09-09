package lt.eimantas.app1;



public class ND1 {
    public static void main(String[] args) {
        //Pirma uzduotis
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE - 1);
        System.out.println(Integer.MAX_VALUE + 1);
        //a) Negaletume; b) Negaletume, reiketu naudoti long;

        //Atemus viena - underflow, pridejus viena - overflow;
        System.out.println("-------");

        //Operatoriai 1:

        int x = 5 % 2;
        System.out.println(x);

        //Operatoriai 2:

        // int y = 2 / 0;
        // System.out.println(y);
        //Erroras dalyba is 0 negalima

        //Operatoriai 3:

        x = 10;
        int y = 5;
        System.out.println(x == 10 && y <= 5); //True
        System.out.println(x <= y && y > 5); //False
        System.out.println("abc" instanceof String); //True

        //Stringai
        //1:
        System.out.println("Sveiki, Jonai," +"\n" + "kaip sekasi?");
        //2:

        String lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit";

        System.out.println(lorem.toLowerCase());
        System.out.println(lorem.toUpperCase());
        System.out.println(lorem.replace('o', 'z'));
        System.out.println(lorem.endsWith("elit"));

    }
}
