package org.example.seminar6.cw2;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {

//1. Напишите метод, который заполнит массив из 1000 элементов случайными
//    цифрами от 0 до 24.
//2. Создайте метод, в который передайте заполненный выше массив и с
//    помощью Set вычислите процент уникальных значений в данном массиве и
//    верните его в виде числа с плавающей запятой.
//    Для вычисления процента используйте формулу:
//    процент уникальных чисел = количество уникальных чисел * 100 / общее
//    количество чисел в массиве.

    public static void main(String[] args) {

        int[] array = fillArray(100, 25);
        System.out.println(Arrays.toString(array));
        System.out.println(getUniquePercent(array));
    }

    public static int[] fillArray(int size, int bound){
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(bound);
        }
        return arr;
    }

    public static double getUniquePercent(int[] arr){
        Set<Integer> uniqueValue = new HashSet<>();
        for (int el : arr){
            uniqueValue.add(el);
        }
        return  (double) (uniqueValue.size() * 100) / arr.length;
    }
}
