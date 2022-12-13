package algoritms.ClassWork_03_12_11_22;

import java.util.Arrays;

public class GreedyAlgoritm2 {
    public static void main(String[] args) {
        int[] array1 = new int[]{0, 200, 375, 550, 750, 950};
        System.out.println(Arrays.toString(array1));
        int[] array2 = new int[array1.length];
        int maxStep = 400;
        int gazPoints = 0;
        int currentStart = 0;
        int currentFinish = currentStart++;
        while (currentFinish < array1.length + 1){
            while (array1[currentStart] + array1[currentFinish] < maxStep) currentFinish++;
            gazPoints++;
            currentStart = currentFinish--;
            currentFinish = currentStart++;
        }
        System.out.println(gazPoints);
    }
}
