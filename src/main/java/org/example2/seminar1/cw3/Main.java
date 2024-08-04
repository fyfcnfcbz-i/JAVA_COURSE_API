package org.example2.seminar1.cw3;

public class Main {
    public static void main(String[] args) {
//        Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
//        максимальное количество подряд идущих 1
        int [] arr = {1,1,0,1,1,1};

        int count = 0;
        int max = 0;

        for (int i:arr){
            if (i == 1){
                count++;
            } else {
                if (count != 0) {
                    if (max < count) {
                        max = count;
                    }
                    count = 0;
                }
            }

        }
        if (count > max){
            max = count;
        }
        System.out.println(max);
    }
}

