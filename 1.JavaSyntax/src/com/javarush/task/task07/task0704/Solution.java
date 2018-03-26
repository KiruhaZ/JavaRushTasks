package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a[] = new int[10];
        int b[] = new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < a.length; i++) {
            b[i] = a[a.length - i - 1];
            System.out.println(b[i]);
        }
    }
}

