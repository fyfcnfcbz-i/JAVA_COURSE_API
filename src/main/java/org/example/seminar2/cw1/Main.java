package org.example.seminar2.cw1;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws Exception{
//        Дано четное число N (>0) и символы c1 и c2.
//                Написать метод, который вернет строку длины N, которая
//        состоит из чередующихся символов c1 и c2, начиная с c1.

        Scanner scanner = new Scanner(System.in);

        Logger logger = Logger.getLogger("Main");
        logger.info("Введи n: ");
        int n = scanner.nextInt();

        if (n <= 0){
            throw new Exception("Не валидное значение");
        }



        StringBuilder sb = stringIn(n);
        System.out.println(sb);


//        shuflLine(n);
    }

    private static StringBuilder stringIn(int n) {
        String c1 = "c1";
        String c2 = "c2";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sb.append(c1);
            } else {
                sb.append(c2);
            }
        }
        return sb;
    }
//    StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < n/2; i++) {
//            sb.append(c1).append(c2);
//        }

//        String c1 = "c1";
//        String c2 = "c2";
//        String res = (c1 + c2).repeat(n/2);
//        System.out.println(res);

//    private static void shuflLine(int n) {
//        String c1 = "c1";
//        String c2 = "c2";
//        String res = "";
//
//        for (int i = 0; i < n; i++) {
//            if (i % 2 == 0){
//                res = res + "c1";
//            }else {
//                res = res + "c2";
//            }
//
//        }
//        System.out.println(res);
//    }
}
