package org.example.seminar5.cw4;

import java.util.HashMap;
import java.util.Map;

public class Main {
//    Написать метод, который переведет число из римского формата записи в арабский.
//    Например, MMXXII = 2022

    public static void main(String[] args) {
        Map<Character, Integer> data = new HashMap<>();
        data.put('I', 1);
        data.put('V', 5);
        data.put('X', 10);
        data.put('L', 50);
        data.put('C', 100);
        data.put('D', 500);
        data.put('M', 1000);

        String rinDate = "IX";
        int areDate = data.get(rinDate.charAt(rinDate.length() - 1));


        for (int i = 0; i < rinDate.length() -1; i++) {
            if(data.get(rinDate.charAt(i)) > data.get(rinDate.charAt(i + 1))) {
                areDate += data.get(rinDate.charAt(i));
            }else {
                areDate -= data.get(rinDate.charAt(i));
            }
        }
        System.out.println(areDate);
    }
}
