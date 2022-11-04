package algoritms.HWork.HW_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Level_02 {
    public static void main(String args[]) {
        Object[] array = {70, "рыба", 250, "круг", 50, 300, 1, "треугольник"};
        System.out.println("Исходный массив: " + Arrays.toString(array));
        int[] intArray = getIntArray(array);
        System.out.println("Массив целых чисел: " + Arrays.toString(intArray));
        Arrays.sort(intArray);
        System.out.println("Отсортированный массив целых чисел: " + Arrays.toString(intArray));
        int median = intArray[intArray.length/2];
        System.out.println("Медианное значение массива: " + median);
    }

    //Получение массива целых чисел из массива Object
    public static int[] getIntArray(Object[] array){
        //Список в который запоминаем объекты класса Integer
        List<Integer> arrayList = new ArrayList<>();
        //Перебираем исходный массив и сравниваем какому классу принадлежит каждый элемент
        for (Object elem:array) {
            if (elem.getClass().toString().equals("class java.lang.Integer")){
                arrayList.add((Integer) elem);
            }
        }
        //Создаем новый массив int из списка
        int[] newIntArray = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size() - 1; i++) {
                newIntArray[i] = arrayList.get(i);
        }
        return newIntArray;
    }
}
// TODO
//  Level 2
//  Найдите медианное значение только чисел в массиве (не используя рекурсию)
//  Разрешается использование алгоритма сортировки массива Quick Sort
//  Полученные данные напечатайте в println
//  САМ МАССИВ: {70, "рыба", 250, "круг" 50, 300, 1, "треугольник"}
//  Примечание: Не среднее арифметическое, а медианное значение

