package seminar5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    /*
    * Задание 1. Создайте программу на Python или Java, которая принимает два списка чисел
    * и выполняет следующие действия:
    *   a. Рассчитывает среднее значение каждого списка.
    *   b. Сравнивает эти средние значения и выводит соответствующее сообщение:
- ""Первый список имеет большее среднее значение"", если среднее значение первого списка больше.
- ""Второй список имеет большее среднее значение"", если среднее значение второго списка больше.
- ""Средние значения равны"", если средние значения списков равны.*/
    public static void main(String[] args) {
        List<Integer> some_list1 = createList(5);
        List<Integer> some_list2 = createList(8);
        System.out.println(some_list1);
        System.out.println(some_list2);
        System.out.println(some_list1.stream().mapToInt(x -> x).average());
        System.out.println(some_list1.stream().mapToInt(x -> x.intValue()).average());
        System.out.println(meanList(some_list1));
        System.out.println(compareListsMean(some_list1, some_list2));
    }

    /**
     * Метод создания списка произвольной длины
     * @param listSize размер списка
     * @return список длины listSize
     */
    public static List<Integer> createList(int listSize) {
        if (listSize < 0){
            throw new IllegalArgumentException("Некорректный размер списка");
        }
        Random rand = new Random();
        List<Integer> new_list = new ArrayList<>();
        for (int i = 0; i < listSize; i++) {
            new_list.add(rand.nextInt(-10, 10));
        }
        return new_list;
    }

    /**
     * Метод нахождения среднего значения элементов списка
     * @param list список
     * @return среднее значение элеменов списка list
     */
    public static double meanList(List<Integer> list) {
        int sum = 0;
        if (list.size() == 0) return 0;
        for (Integer item : list) {
            sum += item;
        }
        return sum * 1.0 / list.size();
    }

    /**
     * Метод сравнения средних значений 2-х списков
          * @param list1 первый список для сравнения
          * @param list2 второй список для сравнения
     * @return сообщение в зависимости от результатов сравнения листов
     */
    public static String compareListsMean(List<Integer> list1, List<Integer> list2) {
        String result = "";
        if (meanList(list1) == meanList(list2)) {
            result = "Средние значения равны";
        } else if (meanList(list1) > meanList(list2)) {
            result = "Первый список имеет большее среднее значение";
        } else if (meanList(list1) < meanList(list2)) {
            result = "Второй список имеет большее среднее значение";
        }
        return result;
    }
}
