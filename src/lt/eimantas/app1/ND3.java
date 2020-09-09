package lt.eimantas.app1;

import java.util.Scanner;

public class ND3 {
    public static void main(String[] args) {
        //CIKLAI
        //1:
        for (int i = 0; i > 1; i++) {
            System.out.println("Ciklas neveikia");
        }
        int j = 0;
        while (j > 1) {
            System.out.println("Ciklas neveikia");
            j++;
        }
        // for (int i = 0; i > -1; i++) {
        //     System.out.println("Ciklas amzinas");
        // }
        // while (j > -1) {
        //     System.out.println("Ciklas amzinas");
        //     j++;
        // }
        Scanner sc = new Scanner(System.in);
        String ivestis = "";
        while(!ivestis.equals("q")) {
            System.out.println("Iveskite teksta:");
            ivestis = sc.nextLine();
        }
        ivestis = "";
        System.out.println("--------------");
        while(!ivestis.equals("q")) {
            System.out.println("Iveskite teksta:");
            ivestis = sc.nextLine();
            StringBuilder reverseIvestis = new StringBuilder();
            reverseIvestis.append(ivestis);
            reverseIvestis.reverse();
            System.out.println(reverseIvestis);
        }
        System.out.println("-----------");
        ivestis = "";
        char[] charArr;
        // while(!ivestis.equals("q")) {
            System.out.println("Iveskite teksta:");
            ivestis = sc.nextLine();
            charArr = ivestis.toCharArray();
            for (int i = 0; i < charArr.length; i++) {
                System.out.println(charArr[i] + " " + (i +1));
            // }
        }
    }
}
