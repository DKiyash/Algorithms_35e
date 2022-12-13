package algoritms.HWork.HW_05;

import java.util.*;

public class Lev_02 {
    public static void main(String[] args) {
        List<Object> list1 = List.of(5, "tt", 3, 5, 3, "tt", 5);
        System.out.println("Исходный список №1:");
        System.out.println(list1);
        System.out.println("Ответ (Queue): " + isListSymmetricQueue(list1));
        System.out.println();
        System.out.println("Ответ (Stack): " + isListSymmetricStack(list1));
        System.out.println();

        List<Object> list2 = List.of(5, "tt", 3, 3, "tt", 5);
        System.out.println("Исходный список №2:");
        System.out.println(list2);
        System.out.println("Ответ (Queue): " + isListSymmetricQueue(list2));
        System.out.println();
        System.out.println("Ответ (Stack): " + isListSymmetricStack(list2));
        System.out.println();

        List<Object> list3 = List.of(5, "ts", 3, 3, "tt", 5);
        System.out.println("Исходный список №3:");
        System.out.println(list3);
        System.out.println("Ответ (Queue): " + isListSymmetricQueue(list3));
        System.out.println();
        System.out.println("Ответ (Stack): " + isListSymmetricStack(list3));
        System.out.println();
    }

    //Решение с очередью
    public static boolean isListSymmetricQueue(List<Object> list) {
        Queue<Object> queue = new LinkedList<>();
        //Перебор списка с начала до середины, добавление элементов в очередь
        for (int i = 0; i < list.size() / 2; i++) {
            queue.add(list.get(i));
        }
        System.out.println("Очередь: " + queue);
        int i = list.size() - 1;//индекс последнего элемента в списке
        //Перебор списка с конца до середины, удаление элементов из очереди
        while (!queue.isEmpty()) {//пока очередь не пустая
            if (!list.get(i).equals(queue.remove()) ) return false;//совпадает ли элемент в очереди и списке
            i--;
        }
        return true;
    }

    //Решение со стеком
    public static boolean isListSymmetricStack(List<Object> list) {
        Stack<Object> stack = new Stack<>();
        //Перебор списка с начала до середины, добавление элементов в stack
        for (int i = 0; i < list.size() / 2; i++) {
            stack.push(list.get(i));
        }
        System.out.println("Stack: " + stack);
        int i = list.size() % 2 == 0 ? list.size()/2 : list.size()/2 + 1;//индекс среднего элемента в списке
        //Перебор списка с конца до середины, удаление элементов из stack
        while (!stack.isEmpty()) {//пока stack не пустой
            if (!list.get(i).equals(stack.pop())) return false;//совпадает ли элемент в stack и списке
            i++;
        }
        return true;
    }
}
//Дан односвязный список. Написать функцию или блок-схему, определяющую,
//образуют ли его элементы симметричную последовательность.
//Для решения задачи использовать стек и очередь. Функция будет возвращать
//значение true, если список является симметричным, false – в противном случае.
//По определению пустой список является симметричным. Поэтому, если список пуст,
//то возвращаем значение true. Для проверки симметричности списка нужно
//проверить на равенство все пары элементов, равностоящих от середины списка.
//Каждая пара содержит один элемент из первой половины списка и один – из второй.
//Элементы первой половины списка последовательно заносятся в очередь,
// второй половины в стек. Если количество элементов списка будет нечетным,
// то серединный элемент будет симметричен сам себе и не будет помещен ни в очередь,
// ни в стек и не будет влиять на результат.
