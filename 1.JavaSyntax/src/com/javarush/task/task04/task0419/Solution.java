package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int n, m;

        if (a >= b) {
            n = a;
        } else {
            n = b;
        }

        if (c >= d) {
            m = c;
        } else {
            m = d;
        }

        if (n >= m) {
            System.out.println(n);
        } else {
            System.out.println(m);
        }
    }
}
