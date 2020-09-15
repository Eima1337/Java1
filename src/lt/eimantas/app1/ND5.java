package lt.eimantas.app1;
import java.util.Arrays;
import java.util.Scanner;

public class ND5 {
    //Get min
    public static int getMin(int[] array) {
        int minValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }
    //Get max
    public static int getMax(int[] array) {
        int maxValue = 0;
        for (int i = 0; i < array.length; i++)
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        return maxValue;
    }
    //Suma
    public static int getSum(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }
    //Sort
    public static void sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite array dydi:");
        int size = sc.nextInt();
        int[] myArray = new int[size];
        System.out.println("Iveskite skaicius:");

        for(int i = 0; i < size; i++) {
            myArray[i] = sc.nextInt();
        }
        ND5 calc = new ND5();
        System.out.println("Max yra: " + calc.getMax(myArray));
        System.out.println("Min  yra: " + calc.getMin(myArray));
        System.out.println("Suma: " + calc.getSum(myArray));
        calc.sortArray(myArray);
        System.out.println("Sorted array: " + Arrays.toString(myArray));
    }
}
