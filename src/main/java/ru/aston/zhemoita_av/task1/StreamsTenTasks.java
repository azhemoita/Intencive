package ru.aston.zhemoita_av.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamsTenTasks {
    public static void main(String[] args) {

        // 1. Вывести все четные числа в диапазоне от 1 до 100
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            list.add(i);
        }

        list.stream().filter(num -> num % 2 == 0).forEach(System.out::println);

        // 2. Умножить каждое число в массиве [1, 2, 3, 4, 5] на 2
        int[] array = {1, 2, 3, 4, 5};
        Arrays.stream(array).map(num -> num * 2);

        // 3. Посчитать сумму чисел в массиве [1, 2, 3, 4, 5], используя reduce()
        Arrays.stream(array).reduce((sum, num) -> sum += num);

        // 4. Вывести числа в диапазоне от 1 до 50 с шагом 2
        IntStream.rangeClosed(1, 50).filter(num -> num % 2 != 0).forEach(System.out::println);

        // 5. Найти первый четный элемент в списке [1, 2, 3, 4, 5]
        Arrays.stream(array).filter(num -> num % 2 == 0).findFirst();

        // 6. Отсортировать элементы массива [1, 3, 5, 7, 9] по возрастанию
        int[] sortArray = {1, 3, 5, 7, 9};
        Arrays.stream(sortArray).sorted();

        // 7. Вывести первые 10 чисел в списке [0, 1, 2, … 99]
        List<Integer> firstTenNumbersList = new ArrayList<>();
        for (int i = 0; i <= 99; i++) {
            firstTenNumbersList.add(i);
        }
        firstTenNumbersList.stream().limit(10).forEach(System.out::println);

        // 8. Пропустить первые 10 элементов списка [0, 1, 2,.., 99] и начать выводить с 11-го элемента, выводя каждый 10-й элемент
        firstTenNumbersList.stream().skip(10).filter(integer -> integer % 10 == 0).forEach(System.out::println);

        // 9. Выведите на экран все числа в диапазоне от 1 до 100, которые делятся на 3
        IntStream.rangeClosed(1, 100).filter(num -> num % 3 == 0).forEach(System.out::println);

        // 10. Выведите все нечетные числа в заданном массиве
        int[] tenTaskArray = {87, 14, 32, 98, 54, 23, 77, 10, 45, 61, 3, 72};
        Arrays.stream(tenTaskArray).filter(number -> number % 2 != 0).forEach(System.out::println);
    }
}
