package org.example.seminar1.cw2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Дана последовательность N целых чисел.
        // Найти количество положительных чисел, после которых следует
        // отрицательное число.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int n = scanner.nextInt();
        int k = getK(scanner, n);
        System.out.println("k = " + k);
    }

    /**
     *
     * @param scanner
     * @param n длина массива
     * @return
     */
    private static int getK(Scanner scanner, int n) {
        int k = 0;
        int a = scanner.nextInt();
        int b;
        for (int i = 0; i < n - 1; i++) {
            b = scanner.nextInt();
            if (a > 0 && b < 0) {
                k++;
            }
            a = b;
        }
        return k;
    }
}
