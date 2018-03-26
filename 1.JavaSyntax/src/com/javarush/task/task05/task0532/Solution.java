package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;

        //напишите тут ваш код
        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(reader.readLine());
            if (i == 0) {
                maximum = a;
            } else if (a > maximum) {
                maximum = a;
            }

        }

        System.out.println(maximum);
    }
}
