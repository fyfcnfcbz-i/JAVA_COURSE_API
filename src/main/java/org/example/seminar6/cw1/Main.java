package org.example.seminar6.cw1;

import java.util.HashSet;
import java.util.Set;

public class Main {

//1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
//    Распечатайте содержимое данного множества.
//2. Создайте LinkedHashSet, заполните его следующими числами:
//    {1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.
//3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
//    Распечатайте содержимое данного множества.

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
//        Set<Integer> set = new LinkedHashSet<>();
//        Set<Integer> set = new TreeSet<>();
        set.add(3);
        set.add(2);
        set.add(1);

        System.out.println(set);


    }
}
