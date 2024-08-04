package org.example2.seminar1.cw4;

public class Main {
    public static void main(String[] args) {

//        Во фразе "Добро пожаловать на курс по Java" переставить слова
//        в обратном порядке.
        String s = "Добро пожаловать на курс по Java";
        System.out.println(s);
        String[] arr = s.split(" ");

//        for(int i = arr.length-1; i>=0; i--)
        for (int i = 0; i < arr.length / 2; i++) {
            String a = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = a;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
