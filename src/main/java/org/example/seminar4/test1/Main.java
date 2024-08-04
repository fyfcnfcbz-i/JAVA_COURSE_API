package org.example.seminar4.test1;

import java.util.LinkedList;

public class Main {
//    Дан LinkedList с несколькими элементами разного типа.
//    В методе revert класса LLTasks реализуйте разворот этого списка без
//    использования встроенного функционала.
    public static void revertLL(LinkedList<Object> ll) {
        int size = ll.size();
        for (int i = 0; i < size / 2; i++) {
            Object temp = ll.get(i);
            ll.set(i, ll.get(size - 1 - i));
            ll.set(size - 1 - i, temp);

        }
    }
    public static void main(String[] args) {
        LinkedList<Object> ll = new LinkedList<>();
        ll.add(1);
        ll.add("One");
        ll.add(2);
        ll.add("Two");
        System.out.println(ll);
        revertLL(ll);
        System.out.println(ll);

    }
}
