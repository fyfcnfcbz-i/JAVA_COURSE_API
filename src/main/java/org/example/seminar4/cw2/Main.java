package org.example.seminar4.cw2;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

//Реализовать консольное приложение, которое:
//1. Принимает от пользователя строку вида text~num
//2. Нужно рассплитить строку по ~, сохранить text в связный список на
//позицию num.
//3. Если введено print~num, выводит строку из позиции num в связном
//списке и удаляет её из списка.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        LinkedList<String> ll = new LinkedList<>();
        while (true) {

            System.out.println("Введите строку в формате текст~цифра, где цифра - позиция : ");
            String str = scanner.nextLine();
            String[] inputStr = str.split("~");


            Integer num = Integer.parseInt(inputStr[1]);

            if (!("print".equals(inputStr[0]))) {
                if (ll.size() >= num) {
                    ll.add(num, inputStr[0]);
                } else {
                    System.out.println("Позиции не существует, элемент помещен в конец");
                    ll.add(inputStr[0]);
                }
            } else {
                if (ll.size() >= num) {
                    System.out.println(ll.get(Integer.parseInt(inputStr[1])));
                } else {
                    System.out.println("Такого элемента не существует");

                }

            }

        }
    }
}
