package org.example.seminar2.cw2;

import java.io.SequenceInputStream;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws Exception{
//        Напишите метод, который сжимает строку.
//        Пример: вход aaaabbbcdd.
//        String str = "aaaabbbcdd";

        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getLogger("Main");
        logger.info("Введи сточку: ");
        String str = scanner.next();

        if(str.isEmpty()){
            throw new Exception("Введена пустая строка");
        }


        String result = getResString(str);
        System.out.println(result);
    }

    private static String getResString(String str) {
        StringBuilder res = new StringBuilder();
        res.append(str.charAt(0));
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) != str.charAt(i+1)){
                res.append(str.charAt(i+1));
            }
        }
        return res.toString();
    }
}
