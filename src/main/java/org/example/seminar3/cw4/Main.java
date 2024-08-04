package org.example.seminar3.cw4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        Каталог товаров книжного магазина сохранен в виде двумерного
//        списка List<ArrayList<String>> так, что на 0й позиции каждого
//        внутреннего списка содержится название жанра, а на остальных
//        позициях - названия книг. Напишите метод для заполнения данной
//        структуры.

        List<ArrayList<String>> bookCatalog = new ArrayList<>();

        addHeader(bookCatalog, "Проза", new String[]{"1", "2", "3"});
        addHeader(bookCatalog, "Поэзия", new String[]{"1", "2", "3"});

//        System.out.println(bookCatalog);

        for (ArrayList<String> janr : bookCatalog) {
            System.out.println("Жанр - " + janr.get(0));
            System.out.print("Список книг: ");
            for (int i = 1; i < janr.size() ; i++) {
                System.out.print(janr.get(i) + ", ");
            }
            System.out.println();
        }
    }

    public static void addHeader(List<ArrayList<String>> bookCatalog, String janr, String[] book) {
        ArrayList<String> list = new ArrayList<>();
        list.add(janr);
        for (int i = 0; i < book.length; i++) {
            list.add(book[i]);
        }
        bookCatalog.add(list);
    }
}
