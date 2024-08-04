package org.example.seminar3.test1;

import java.util.Arrays;



public class Main {

//    Внутри класса MergeSort напишите метод mergeSort, который принимает
//    массив целых чисел, реализует алгоритм сортировки слиянием.
//    Метод должен возвращать отсортированный массив.

    // Метод сортировки слиянием
    public static int[] mergeSort(int[] array) {
        if (array.length <= 1) {
            return array; // Базовый случай: массив из одного элемента (или пустой) уже отсортирован
        }

        int mid = array.length / 2; // Находим середину массива
        int[] left = Arrays.copyOfRange(array, 0, mid); // Копируем левую часть массива
        int[] right = Arrays.copyOfRange(array, mid, array.length); // Копируем правую часть массива

        left = mergeSort(left); // Рекурсивно сортируем левую часть
        right = mergeSort(right); // Рекурсивно сортируем правую часть

        return merge(left, right); // Сливаем две отсортированные части
    }

    // Метод слияния двух отсортированных массивов
    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length]; // Результирующий массив
        int i = 0, j = 0, k = 0; // Индексы для left, right и result массивов

        // Пока есть элементы в обоих массивах
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k] = left[i]; // Добавляем меньший элемент из left
                i++; // Переходим к следующему элементу в left
            } else {
                result[k] = right[j]; // Добавляем меньший элемент из right
                j++; // Переходим к следующему элементу в right
            }
            k++; // Переходим к следующей позиции в result
        }

        // Копируем оставшиеся элементы из left, если есть
        while (i < left.length) {
            result[k] = left[i];
            i++;
            k++;
        }

        // Копируем оставшиеся элементы из right, если есть
        while (j < right.length) {
            result[k] = right[j];
            j++;
            k++;
        }

        return result; // Возвращаем результирующий массив
    }




    public static void main(String[] args) {
        int[] array = {38, 27, 43, 3, 9, 82, 10};
        int[] sortedArray = mergeSort(array);
        System.out.println(Arrays.toString(sortedArray)); // Выводим отсортированный массив
    }



}
