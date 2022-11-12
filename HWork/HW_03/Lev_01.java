package algoritms.HWork.HW_03;

import java.util.Arrays;

public class Lev_01 {
    public static void main(String[] args) {
        int[] array = {3, 60, 35, 2, 45, 320, 5};
        System.out.println(Arrays.toString(array));
        bubleSortWhile(array);
        System.out.println(Arrays.toString(array));

    }

    public static void bubleSortWhile(int[] array) {
        int n = array.length;
        System.out.println("n = " + n);
        System.out.println(Arrays.toString(array));
        int i = 0;
        while (i < n - 1) {
            int j = 0;
            while (j < n - i - 1) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    System.out.println(Arrays.toString(array));
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }

}

//Level 1
//Методом простого обмена («пузырек») отсортируйте массив используя
// не вложенные циклы for, a конструкцию while.
//Массив: {3,60,35,2,45,320,5}