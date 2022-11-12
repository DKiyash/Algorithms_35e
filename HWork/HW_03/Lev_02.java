package algoritms.HWork.HW_03;

import java.util.Arrays;

public class Lev_02 {
    public static void main(String[] args) {
        int[] array = new int[10];
        fillArrayRandom(array);
        System.out.println(Arrays.toString(array));
        bubleSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void fillArrayRandom(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)Math.round(Math.random() * 165) - 65;
        }
    }
    public static void bubleSort(int[] array) {
        int n = array.length;
        System.out.println("n = " + n);
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++)
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    System.out.println(Arrays.toString(array));
                }
            System.out.println();
        }
    }
}

//Level 2
//Задать массив из 10 элементов случайным образом из отрезка [-66;99].
//Отсортировать элементы массива по убыванию методом простого обмена («пузырек»).