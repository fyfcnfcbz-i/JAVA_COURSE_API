package org.example.seminar5.cw2;

import java.util.HashMap;
import java.util.Map;

public class Main {

    //Даны 2 строки, написать метод, который вернет true, если эти строки
//    являются изоморфными и false, если нет. Строки изоморфны, если одну
//    букву в первом слове можно заменить на некоторую букву во втором слове,
//1. при этом повторяющиеся буквы одного слова меняются на одну и ту же букву
//    с сохранением порядка следования. (Например, add - egg изоморфны)
//2. буква может не меняться, а остаться такой же. (Например, note - code)
//    Пример 1:
//    Input: s = "foo", t = "bar"
//    Output: false
//    Пример 2:
//    Input: s = "paper", t = "title"
//    Output: true
    public static boolean areIsomorphinc(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        Map<Character, Character> map1 = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if(!map1.containsKey(c1)){
                map1.put(c1, c2);
            }else {
                if (map1.get(c1) != c2){
                    return false;
                }
            }
        }
        return true;
    }

        public static void main (String[]args){
            System.out.println("areIsomorphinc(\"add\", \"egg\") = " + areIsomorphinc("add", "egg"));
        }
    }
