package org.example.seminar3.cw3_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

//        Создать список типа ArrayList<String>.
//        Поместить в него как строки, так и целые числа.
//        Пройти по списку и вывести инфо, какое значение строка, а какое - число.
//        Пройти по списку, найти и удалить целые числа.

        ArrayList<String> list = new ArrayList<>(Arrays.asList(
                "java", "42", "Python", "1"
        ));
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String elem = iterator.next();
            try {
                Integer.parseInt(elem);
                iterator.remove();
            }catch (NumberFormatException ex){

            }

        }
        System.out.println(list);
    }
}
