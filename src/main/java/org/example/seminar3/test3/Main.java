package org.example.seminar3.test3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

//Реализуйте метод, который принимает на вход целочисленный массив arr:
//- Создаёт список ArrayList, заполненный числами из исходого массива arr.
//- Сортирует список по возрастанию и выводит на экран.
//- Находит минимальное значение в списке и выводит на экран - Minimum is
// {число}
// - Находит максимальное значение в списке и выводит на экран -
// Maximum is {число}
//- Находит среднее арифметическое значений списка и выводит на экран -
// Average is =  {число}
//Напишите свой код в методе analyzeNumbers класса Answer. Метод
// analyzeNumbers принимает на вход один параметр:
//Integer[] arr - массив целых чисел.

    public static void analyzeNumbers(Integer[] arr) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        int min = Collections.min(list);
        System.out.println("Minimum is " + min);

        int max = Collections.max(list);
        System.out.println("Maximum is " + max);

        double average = list.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
        System.out.println("Average is " + average);
    }


    public static void main(String[] args) {
        Integer[] arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};

        analyzeNumbers(arr);
    }
}
