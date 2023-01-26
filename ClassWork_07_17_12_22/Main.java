package algoritms.ClassWork_07_17_12_22;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {5, 6, 8, 9};
        System.out.println(Arrays.toString(reverse(array1, 3)));
        System.out.println(Arrays.toString(reverse(array2, 3)));
    }

    public static int[] reverse(int[] arr, int k) {
        int[] newArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
        if (i < k) newArray [k - i - 1] = arr[i];
        else newArray[i] = arr[i];
        }
        return newArray;
    }
}


