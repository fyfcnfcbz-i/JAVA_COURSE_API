package org.example2.seminar1.cw5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Реализовать функцию возведения числа а в степень b.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число a: ");
        int a = scanner.nextInt();
        System.out.print("Введите число b: ");
        int b = scanner.nextInt();

        double c = Math.pow(a,b);

//        int c = pow(a, b);
        System.out.println(c);


//        int res = 1;
//        for (int i = 0; i < b; i++) {
//            res = res * a;
//        }
    }
//        System.out.println(res);

//    public static int pow(int a, int b) {
//        if (b == 1){
//            return a;
//        } else {
//            return a * pow(a, b -1);
//        }
//
//    }
}


