package org.example2.seminar4.cw1;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {

//Дан Deque состоящий из последовательности цифр. Необходимо проверить,
//что последовательность цифр является палиндромом.

        Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1, 3, 2, 1));
        Main main = new Main();
        System.out.println(main.checkOn(deque));
    }


    public static boolean checkOn(Deque<Integer> deque) {
        if(deque == null){
            throw new IllegalStateException();
        }
        if (deque.size() <=1){
            return true;
        }
        while (deque.size() >= 2){
            if(deque.pollFirst() != deque.pollLast()){
                return false;
            }
        }
        return true;
    }
}
