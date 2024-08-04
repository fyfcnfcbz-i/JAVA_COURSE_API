package org.example2.seminar1.cw1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name  = scanner.next();
//        System.out.println("Привет, " + name);

        String out = new String("Привет, %s");
        System.out.printf(out, name);
    }
}
