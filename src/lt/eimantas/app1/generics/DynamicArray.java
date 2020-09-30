package lt.eimantas.app1.generics;

import java.util.Arrays;

public class DynamicArray {
    public static void main(String[] args) {
        DynamicArr<String> dArr = new DynamicArr<>();
        dArr.add("taip");
        dArr.add("taaip");
        dArr.add("ne");
        System.out.println(dArr);
    }
}

class DynamicArr<T> {
    T[] arr = (T[]) new Object[1];
    int counter = 0;
    // init

    public DynamicArr(int initialCount) {
        this.arr = (T[]) new Object[initialCount];
    }

    public DynamicArr() {
        this.arr = (T[]) new Object[1];
    }

    // add
    public void add(T item) {
        if (counter == this.arr.length) {
            T[] tmp = this.arr;
            this.arr = (T[]) new Object[counter + 1];
            for (int i = 0; i < tmp.length; i++) {
                this.arr[i] = tmp[i];
            }
        }
        this.arr[counter] = item;
        counter++;
    }
    // rem


    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}