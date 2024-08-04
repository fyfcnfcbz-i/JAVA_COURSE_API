package org.example.seminar2.cw3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Напишите метод, который принимает на вход строку (String) и
//        определяет является ли строка палиндромом (возвращает
//        boolean значение).

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str = str.replaceAll("\\s", "").toLowerCase();
        if (str.equals(new StringBuilder(str).reverse().toString())){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
//        palindrom(str);

    }

//    private static void palindrom(String str) {
//        boolean flag = true;
//        for (int i = 0; i < str.length() / 2; i++) {
//            if (str.charAt(i) != str.charAt(str.length() - 1 - i)){
//                flag = false;
//                break;
//            }
//        }
//        if(flag){
//            System.out.println("Число палиндром");
//        }else {
//            System.out.println("Число не палиндром");
//        }
//    }
}
