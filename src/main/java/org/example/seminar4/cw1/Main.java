package org.example.seminar4.cw1;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

//1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
//2) Замерьте время, за которое в LinkedList добавятся 10000 элементов.
//    Сравните с предыдущим

    public static void main(String[] args) {

        long startTimeArray = System.currentTimeMillis();
        ArrayList<Integer> array = getArrayValues();
        long endTimeArray = System.currentTimeMillis();
        long timeElapsedArray = endTimeArray - startTimeArray;

        System.out.println("10000 элементов добавлены в ArrayList и выведены в консоль за " + timeElapsedArray + " миллисекунд(ы)");

        long startTimeList = System.currentTimeMillis();
        LinkedList<Integer> list = getListValues();
        long endTimeList = System.currentTimeMillis();
        long timeElapsedList = endTimeList - startTimeList;

        System.out.println("10000 элементов добавлены в LinkedList и выведены в консоль за " + timeElapsedList + " миллисекунд(ы)");

    }

    private static ArrayList<Integer> getArrayValues() {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            array.add(i);
        }
        return array;
    }

    private static LinkedList<Integer> getListValues() {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }
        return list;
    }


}
