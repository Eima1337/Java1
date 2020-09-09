package lt.eimantas.app1;

import java.util.Scanner;

public class ND2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Įveskite savo amžių:");
        String age = sc.nextLine();
        if (Integer.parseInt(age) >= 45) {
            System.out.println("Galite ir balsuoti, ir kandidatuoti");
        } else if (Integer.parseInt(age) >= 18) {
            System.out.println("Galite balsuoti");
        } else {
            System.out.println("Negalite balsuoti");
        }
    }
}
