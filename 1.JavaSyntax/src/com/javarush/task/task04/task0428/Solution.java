package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int res = 0;

        if (a > 0) {
            res++;
        }
        if (b > 0) {
            res++;
        }
        if (c > 0) {
            res++;
        }
        System.out.println(res);
    }
}
