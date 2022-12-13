package algoritms;

import java.util.Queue;
import java.util.Random;
import java.util.stream.IntStream;

public class ClassWork_06_10_12_22 {
    public static void main(String[] args) {
        Random random = new Random();
        IntStream randStream = random.ints(5);
        randStream.forEach(System.out::println);

    }
}
