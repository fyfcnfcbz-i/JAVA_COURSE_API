package org.example.seminar3.test2;

import java.util.ArrayList;

public class Main {
//        Дан произвольный массив целых чисел. Создайте список ArrayList,
//        заполненный данными из этого массива. Необходимо удалить из списка
//        четные числа и вернуть результирующий.
//
//        Напишите свой код в методе removeEvenNumbers класса Answer.
//        Метод removeEvenNumbers принимает на вход один параметр:
//        Integer[] arr - список целых чисел, возвращает список ArrayList<Integer>


    public static ArrayList<Integer> removeEvenNumbers(Integer[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer i : arr) {
            if (i % 2 != 0) {
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{2, 4, 6, 8};
        System.out.println(removeEvenNumbers(arr));

    }
}
