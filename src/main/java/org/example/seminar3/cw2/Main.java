package org.example.seminar3.cw2;

import java.util.*;


public class Main {
    public static void main(String[] args) {

//        Заполнить список десятью случайными числами.
//        Отсортировать список методом sort() и вывести его на
//        экран.
//
        int [] list = new int[10];

        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random()*100);
        }

        for (int i : list) {
            System.out.printf("%d ", i);
        }
        System.out.println();

        Arrays.sort(list);

        for (int i : list) {
            System.out.printf("%d ", i);
        }
        System.out.println();


        Random rnd = new Random();
        List<Integer> list2 = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list2.add(rnd.nextInt(100, 500));

        }

        System.out.println(list2);
        Collections.sort(list2);
        System.out.println(list2);
    }
}
