package lt.eimantas.app1;

import java.sql.SQLOutput;
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

        //RIKIAVIMO ALGORITMAS + COUNTERIS

        System.out.println("--------------" + "\n" + "RIKIAVIMAS");
        int counter = 0;
        int itCounter = 0;
        int[] arr = {4, 1, 2, 0, 6};
        System.out.println(Arrays.toString(arr) + "\n" + "Counteris");
        for (int k = 0; k < arr.length - 1; k++) {
            for(int j = 0; j < arr.length - 1; j++) {
                itCounter++;
                if (arr[j] > arr[j + 1]) {
                    counter++;
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        System.out.println("Isrikiuotas masyvas: " + "\n" + Arrays.toString(arr));
        System.out.println("Iteraciju counter " + itCounter);
        System.out.println("Apkeitimu skaicius " + counter);
    }
}

