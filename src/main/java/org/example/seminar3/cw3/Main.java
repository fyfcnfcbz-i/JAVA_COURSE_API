package org.example.seminar3.cw3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Заполнить список названиями планет Солнечной
//        системы в произвольном порядке с повторениями.
//        Вывести название каждой планеты и количество его
//        повторений в списке.
//                Пройти по списку из предыдущего задания и удалить
//        повторяющиеся элементы.


        List<String> planets = new ArrayList<>();
        planets.add("Меркурий");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Юпитер");
        planets.add("Сатурн");
        planets.add("Уран");
        planets.add("Нептун");
        planets.add("Плутон");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размерность: ");
        int n = scanner.nextInt();

        List<String> rndPlanets = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            rndPlanets.add(planets.get((int) (Math.random() * planets.size())));
        }
        System.out.println(rndPlanets);

        Collections.sort(rndPlanets);
        System.out.println(rndPlanets);

        int count = 1;
        for (int i = 0; i < rndPlanets.size(); i++) {
            if ((i < rndPlanets.size() - 1 && rndPlanets.get(i).equals(rndPlanets.get(i + 1)))) {
                count++;
            } else {
                System.out.println(rndPlanets.get(i) + ":" + count);
                count = 1;
            }
        }

        List<String> resPlanets = new ArrayList<>();
        for (int i = 0; i < rndPlanets.size() ; i++) {
            if (i == rndPlanets.size() - 1 || !rndPlanets.get(i).equals(rndPlanets.get(i + 1))) {
                resPlanets.add(rndPlanets.get(i));


            }
        }

        System.out.println(resPlanets);

        scanner.close();

        }
    }

