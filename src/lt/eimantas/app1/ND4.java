package lt.eimantas.app1;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.Arrays;

public class ND4 {
    public static void main(String[] args) {

        int[] array1 = new int[]{1, 2, 5, 19, 10};

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println(Arrays.toString(array1));


        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite masyvo ilgi:");
        int num = sc.nextInt();
        int[] array2 = new int[num];



        for (int i = 0; i < array2.length; i++) {
            System.out.println("Iveskite skaicius:");
            array2[i] = sc.nextInt();
        }
        System.out.println("Jusu masyvas (sorted):");
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        int sum = IntStream.of(array2).sum();
        double avg = IntStream.of(array2).average().orElse(Double.NaN);
        System.out.println("Masyvo suma: " + sum);
        System.out.println("Masyvo vidurkis: " + avg);

    }
}

