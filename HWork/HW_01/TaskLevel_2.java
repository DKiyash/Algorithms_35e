package algoritms.HWork.HW_01;

import java.util.Scanner;

public class TaskLevel_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = scanner.nextInt();
        System.out.println(sumOfNumber(number));
    }

    public static int sumOfNumber(int number) {
        if (number <= 10) return number;
        else return number % 10 + sumOfNumber(number / 10);
    }
}

//Level 2
//Дано натуральное число N. Вычислите сумму его цифр.
//При решении этой задачи нельзя использовать строки, списки,
//массивы (ну и циклы, разумеется). Используйте подход Рекурсии.
//Ввод | 179
//Вывод | 17