package algoritms.ClassWork_03_12_11_22;

import java.util.Arrays;

public class BubleSortTest {
    public static void main(String[] args) {
        int[] array = {4, 44, 3, 1, 6, 560, 999, 2, 90, 5};
        System.out.println(Arrays.toString(array));
        bubleSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void bubleSort(int[] array){
        int n = array.length;
        System.out.println("n = " + n);
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    System.out.println(Arrays.toString(array));
                }
            System.out.println();
        }
    }
}
