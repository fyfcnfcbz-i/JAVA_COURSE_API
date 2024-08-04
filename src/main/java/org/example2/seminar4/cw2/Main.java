package org.example2.seminar4.cw2;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
//Даны два Deque представляющие два неотрицательных целых числа. Цифры
//хранятся в обратном порядке, и каждый из их узлов содержит одну цифру.
//Сложите два числа и верните сумму в виде связанного списка.
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1, 2, 3));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5, 4, 7));
        Main main = new Main();
        System.out.println(main.sum(d1,d2).toString());
    }

    public Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {
        if (d1 == null || d2 == null) {
            throw new IllegalStateException();
        }
        Deque<Integer> result = new ArrayDeque<>();
        int digit = 0;
        while (d1.size() > 0 || d2.size() > 0) {
            int sum = 0 + digit;
            digit = 0;
            if (d1.size() >0){
                sum = sum + d1.poll();
            }
            if (d2.size() >0){
                sum = sum + d2.poll();
            }
            if (sum > 9){
                digit = 1;
                sum = sum - 10;

            }
            result.offer(sum);
        }

        if (digit!=0){
            result.offer(digit);
        }
        return new ArrayDeque<>();
    }

}
