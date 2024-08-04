package org.example2.seminar1.cw2;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        В консоли запросить имя пользователя. В зависимости от
//        текущего времени, вывести приветствие вида
//        "Доброе утро, <Имя>!", если время от 05:00 до 11:59
//        "Добрый день, <Имя>!", если время от 12:00 до 17:59;
//        "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
//        "Доброй ночи, <Имя>!", если время от 23:00 до 4:59

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        LocalDateTime dateTime = LocalDateTime.now();
        int i = dateTime.getHour();
//        System.out.println(i);

        if (i >= 5 && i < 12){
            System.out.println("Доброе утро, " + name);
        }
        if (i >= 12 && i < 18) {
            System.out.println("Доброе день, " + name);
        }
        if (i >= 18 && i < 23) {
            System.out.println("Доброе вечер, " + name);
        }
        if (i < 5 || i == 23) {
            System.out.println("Доброе ночи, " + name);
        }
    }
}
