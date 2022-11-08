package algoritms.ClassWork_03_05_11_22;
import java.util.Arrays;

/**
 *
 Сортировка слиянием

 Временная сложность алгоритма сортировки слиянием одинакова в лучшем, среднем и худшем случаях и равна O(n*log(n))


 1/ Сначала проверьте, меньше ли левый индекс массива, чем правый индекс, если да, то вычислите его среднюю точку

 2/ Теперь, как мы уже знаем, сортировка слиянием сначала итеративно делит весь массив на равные половины, если не достигнуты атомарные значения.

 3/ Здесь мы видим, что массив из 7 элементов разбит на два массива размером 4 и 3 соответственно.

 4/ Теперь снова найдите, что левый индекс меньше правого индекса для обоих массивов, если найдено да, затем снова вычислите средние точки для обоих массивов.

 5/ Теперь разделите эти два массива еще на две половины, пока не будут достигнуты атомарные единицы массива и дальнейшее деление станет невозможным.

 6/ После разделения массива на наименьшие единицы снова начните объединять элементы на основе сравнения размеров элементов.

 Во-первых, сравните элемент для каждого списка, а затем объедините их в другой список в отсортированном виде.

 */

public class mergeSortLesson {
    public static void main(String[] args) {
        /*
        mergeSort(arr) - function that sorts arr[leftIndex..rightIndex] using merge()
        merge(arr, leftArr, rightArr) - Merges two sub arrays of arr[].
         */

        int[] arr = {15, 21, 13, 5, 10, 7};
        System.out.println("Given Array");
        System.out.println(Arrays.toString(arr));

        mergeSort(arr);
        System.out.println("Sorted array");
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr) {
        int lengthArr = arr.length; // длинна массива

        if (lengthArr == 1) { // условие выхода
            return;
        }

        int mid = lengthArr / 2;
        int[] leftArr = new int[mid]; // левый подмассив*
        int[] rightArr = new int[lengthArr - mid]; // правый подмассив*

        // копируем элементы из массива в подмассивы
        for (int i = 0; i < mid; ++i) {
            leftArr[i] = arr[i];
        }
        for (int j = 0; j < lengthArr - mid; ++j) {
            rightArr[j] = arr[j + mid];
        }


        mergeSort(leftArr);
        mergeSort(rightArr);

        // когда достигли базового условия, начинаем слияние
        merge(arr, leftArr, rightArr);
    }

    private static void merge(int[] arr, int[] leftArr, int[] rightArr) {
        int leftArrLength = leftArr.length;
        int rightArrLength = rightArr.length;

        // контролируем индексы подмассивов
        int leftIndex = 0;
        int rightIndex = 0;

        // контролируем индекс в основном массиве
        int arrIndex = 0;


        while (leftIndex < leftArrLength && rightIndex < rightArrLength) {
            if (leftArr[leftIndex] < rightArr[rightIndex]) { // сравниваем элемент в левом и правом подмассиве
                arr[arrIndex] = leftArr[leftIndex]; // если условие верно, то элемент в левом меньше, сохраняем его в 0 ячейку основного массива
                leftIndex++;
                arrIndex++;
            } else {
                arr[arrIndex] = rightArr[rightIndex];
                rightIndex++;
                arrIndex++;
            }
        }

        // копируем элементы если остались из левого
        while (leftIndex < leftArrLength) {
            arr[arrIndex] = leftArr[leftIndex];
            leftIndex++;
            arrIndex++;
        }

        // копируем элементы из правого
        while (rightIndex < rightArrLength) {
            arr[arrIndex] = rightArr[rightIndex];
            rightIndex++;
            arrIndex++;
        }
    }
}
