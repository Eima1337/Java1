package lt.eimantas.app1;

import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int counter = 1;
        int[] arr = {4, 1, 2, 4, 5, 6};
        System.out.println(Arrays.toString(arr));
        for (int k = 0; k < arr.length - 1; k++) {
            for(int j = 0; j < arr.length - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j + 1];
                arr[j + 1] = arr[j];
                arr[j] = temp;
                System.out.println(counter++);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}