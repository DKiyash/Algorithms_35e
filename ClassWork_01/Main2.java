package algoritms.ClassWork_01;

public class Main2 {
    public static void main(String[] args) {
        int[] array1 = new int[]{40, 250, 80, 88, 240, 12, 148};
        System.out.println(getMinElement(array1, 1, array1[0]));
        System.out.println(getMaxElement(array1, 1, array1[0]));

    }
    public static int getMinElement(int[] array, int item, int min) {
        if (min > array[item])
            min = array[item];

        if (item == array.length - 1)
            return min;
        else
            return getMinElement(array, item + 1, min);
    }
    public static int getMaxElement(int[] array, int item, int max) {
        if (max < array[item])
            max = array[item];

        if (item == array.length - 1)
            return max;
        else
            return getMaxElement(array, item + 1, max);
    }

}
