package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a[] = new int[20];
        int x[] = new int[10];
        int y[] = new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < a.length; i++) {
            if (i < 10) {
                x[i] = a[i];
            } else {
                y[i - 10] = a[i];
            }
        }

        for (int q : y) {
            System.out.println(q);
        }
    }
}
