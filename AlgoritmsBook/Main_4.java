package algoritms.AlgoritmsBook;

import java.util.Arrays;

public class Main_4 {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        fillArray(array1);
        System.out.println(Arrays.toString(array1));
        System.out.println(sumOfElements(array1, array1.length - 1));
        System.out.println(countNumberElements(array1, array1.length - 1));
    }

    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random() * 20);
        }
    }

    public static int sumOfElements(int[] array, int maxIndex) {
        if (maxIndex == 0) return array[0];
        return array[maxIndex] + sumOfElements(array, maxIndex - 1);
    }

    public static int countNumberElements(int[] array, int maxIndex) {
        if (maxIndex == 0) return 1;
        return 1 + countNumberElements(array, maxIndex - 1);
    }
//    public static int maxElem(int[] array, int currentIndex, int max) {
//        if (array.length == 0) return -1;
//        if (currentIndex == array.length)
//        return 1 + countNumberElements(array, maxIndex - 1);
//    }
}
//1. Напишите рекурсивную функцию для подсчета
//суммы элементов в массиве
//2. Напишите рекурсивную функцию для подсчета
//количества элементов в массиве.
//3. Найдите наибольшее число в списке.