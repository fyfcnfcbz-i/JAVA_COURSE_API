package org.example.seminar1.cw3;

public class Main {
    public static void main(String[] args) {
//        Дана строка. Поменять местами ее половины.
        String str = "qweasd";
        str.substring(0, str.length()/2);
        String result = str.substring(str.length()/2) + str.substring(0, str.length()/2);
        System.out.println("result = " + result);

    }
}
