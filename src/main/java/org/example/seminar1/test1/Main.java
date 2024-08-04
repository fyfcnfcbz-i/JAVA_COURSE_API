package org.example.seminar1.test1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Внутри класса Answer напишите метод countNTriangle,
//        который принимает число n и возвращает его n-ое треугольное число.
//        Если число n < 1 (ненатуральное) метод должен вернуть -1.

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int res = countNTriagle(n);
        System.out.println(res);
    }

    private static int countNTriagle(int n) {
        int res = 0;
        if (n < 1){
            return -1;
        } else {
            for (int i = 1; i <= n; i++) {
                res = res + i;
            }
            return res;
        }

    }
}
