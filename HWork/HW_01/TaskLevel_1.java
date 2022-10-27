package algoritms.HWork.HW_01;

import java.util.Scanner;

public class TaskLevel_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = scanner.nextInt();
        if (isItDegree(number)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean isItDegree(int number) {
        if (number / 2 == 0 || number % 2 != 0) return false;
        else if (number / 2 == 1) return true;
        else return isItDegree(number / 2);
    }
}

//Level 1
//Дано натуральное число N. Выведите слово YES, если число N является
//точной степенью двойки, или слово NO в противном случае.
//Операцией возведения в степень пользоваться нельзя!
// Используйте подход Рекурсии.
//Ожидаемый результат:
//Ввод | 8 | Yes
//Вывод | 3 | NO