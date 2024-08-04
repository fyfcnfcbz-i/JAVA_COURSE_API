package org.example.seminar4.test2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    //    В классе MyQueueInt реализуйте очередь для типа данных Integer
//    с помощью LinkedList со следующими методами:
//
//    enqueue() - помещает элемент в конец очереди
//    dequeue() - возвращает первый элемент из очереди и удаляет его
//    first() - возвращает первый элемент из очереди, не удаляя
//    getElements() - возвращает все элементы в очереди
    private LinkedList<Integer> elements = new LinkedList<>();

    public void enqueue(int element) {
        // Напишите свое решение ниже
        elements.addLast(element);
    }

    public int dequeue() {
        // Напишите свое решение ниже
        if (elements.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return elements.removeFirst();
    }

    public int first() {
        // Напишите свое решение ниже
        if (elements.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return elements.getFirst();
    }

    public LinkedList<Integer> getElements() {
        // Напишите свое решение ниже
        return new LinkedList<>(elements);
    }


    public static void main(String[] args) {
        Main queue = new Main();

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            queue.enqueue(1);
            queue.enqueue(10);
            queue.enqueue(15);
            queue.enqueue(5);
        } else {
            queue.enqueue(Integer.parseInt(args[0]));
            queue.enqueue(Integer.parseInt(args[1]));
            queue.enqueue(Integer.parseInt(args[2]));
            queue.enqueue(Integer.parseInt(args[3]));
        }

        System.out.println(queue.getElements());

        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.getElements());

        System.out.println(queue.first());
    }
}
