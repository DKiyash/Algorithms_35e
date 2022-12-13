package algoritms.ClassWork_03_12_11_22;

import java.util.Arrays;

public class GreedyAlgoritm {
    public static void main(String[] args) {
        int[] array1 = new int[]{3, 1, 7, 9, 9, 5};
        String str = "";
        System.out.println(Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
        for (int i = array1.length - 1; i > 0; i--) {
            str += array1[i];
        }
        System.out.println(str);
    }
}
