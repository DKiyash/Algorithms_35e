package algoritms.HWork.HW_02;

import java.util.Arrays;

public class Level_01 {
    public static void main(String args[]) {
        int[] array = {70, 250, 50, 300, 1};
        System.out.println(Arrays.toString(array));
        System.out.println("Максимальный элемент массива: " + getMaxElement(array));
        System.out.println("Минимальный элемент массива: " + getMinElement(array));
    }
    public static int getMaxElement(int[] array){
        if (array.length == 0) return -1;
        int max = array[0];
        for (int elem: array) {
            if (elem > max) max = elem;
        }
        return max;
    }
    public static int getMinElement(int[] array){
        if (array.length == 0) return -1;
        int min = array[0];
        for (int elem: array) {
            if (elem < min) min = elem;
        }
        return min;
    }
}
// TODO
//  Level 1
//  Найдите самое большое и самое маленькое число в заданном массиве
//  не используя рекурсию в функции getMaxMinElement().
//  Разрешается использование алгоритма сортировки массива Quick Sort.
//  Полученные данные напечатайте в println
//  САМ МАССИВ: {70, 250, 50, 300, 1}

