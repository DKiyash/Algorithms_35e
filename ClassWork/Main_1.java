package algoritms.ClassWork;

public class Main_1 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        long start = System.nanoTime();
        System.out.println(sumElemArray(0, array1));
        System.out.println(System.nanoTime() - start);
    }

    public static int sumElemArray(int n, int[] array) {
        int sum = 0;
        if (n == array.length) return 0;
        sum = sum + array[n] + sumElemArray(n + 1, array);
        return sum;
    }
}


//    static int Sum(int i, int[] A) {
//        if (i==(A.length-1))
//            return A[i];
//        return A[i] + Sum(i+1,A);
//    }
