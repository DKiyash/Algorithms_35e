package algoritms.HWork.HW_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Lev_01 {
    public static void main(String[] args) {
        char[] chars1 = "([{}])".toCharArray();
        System.out.println("Ответ (Stack): " + isListSymmetricStack(chars1));
        System.out.println();

        char[] chars2 = "([)]".toCharArray();
        System.out.println("Ответ (Stack): " + isListSymmetricStack(chars2));
        System.out.println();

        char[] chars3 = "{()]".toCharArray();
        System.out.println("Ответ (Stack): " + isListSymmetricStack(chars3));
        System.out.println();

    }

    public static boolean isListSymmetricStack(char[] chars) {
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(chars));
        Stack<Character> stack = new Stack<>();
        //Перебор списка с начала до середины, добавление элементов в stack
        for (int i = 0; i < chars.length / 2; i++) {
            stack.push(chars[i]);
        }
        System.out.println("Stack: " + stack);
        int i = chars.length % 2 == 0 ? chars.length / 2 : chars.length / 2 + 1;//индекс среднего элемента в списке
        //Перебор списка с конца до середины, удаление элементов из stack
        while (!stack.isEmpty()) {//пока stack не пустой
            char ch = stack.pop();
            if (ch == '(' && chars[i] != ')') return false;//совпадает ли элемент в stack и списке
            else if (ch == '{' && chars[i] != '}') return false;//совпадает ли элемент в stack и списке
            else if (ch == '[' && chars[i] != ']') return false;//совпадает ли элемент в stack и списке
            i++;
        }
        return true;
    }

}
//Последовательность ([{}]) является правильной,
//а последовательности ([)], {()] правильными не являются.
// Докажите это используя стек!