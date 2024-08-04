package org.example.seminar1.cw4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Дан массив целых чисел. Верно ли, что массив является симметричным.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи размер массива: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Введи значение элемента массива: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }


        if (IsSimetr(arr)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }


        System.out.println("Массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
//            System.out.println(" %d ,",arr[i]);
        }

    }

    private static boolean IsSimetr(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
