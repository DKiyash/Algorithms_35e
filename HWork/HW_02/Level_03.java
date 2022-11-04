package algoritms.HWork.HW_02;

import java.util.Arrays;

public class Level_03 {
    public static void main(String[] args) {
        String string1 = "poiuytrewqlkjhgfdsamnbvcxz";
        char[] chars = string1.toCharArray();
        Arrays.sort(chars);
        System.out.println(chars);
    }
}
// TODO
//  Level 3
//  Расставьте в алфавитном порядке буквы.
//  Разрешается использование алгоритма сортировки массива Quick Sort.
//  Полученные данные напечатайте в println
//  На вход строка: "poiuytrewqlkjhgfdsamnbvcxz"
