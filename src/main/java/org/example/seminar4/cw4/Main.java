package org.example.seminar4.cw4;

import java.util.ArrayDeque;
import java.util.Stack;

public class Main {
//1) Написать метод, который принимает массив элементов, помещает их в стэк
//и выводит на консоль содержимое стэка.
//2) Написать метод, который принимает массив элементов, помещает их в
//очередь и выводит на консоль содержимое очереди.
    public static void main(String[] args) {
        String[] str = {"1", "2", "3", "4"};
        
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < str.length; i++) {
            stack.push(str[i]);
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
        System.out.println();
        ArrayDeque<String> arr = new ArrayDeque<>();
        for (int i = 0; i < str.length; i++) {
            arr.offer(str[i]);
        }
        while (!arr.isEmpty()){
            System.out.print(arr.poll());
        }
    }
}
