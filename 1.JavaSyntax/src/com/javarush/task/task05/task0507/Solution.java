package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a= 0;
        double count = 0;
        double sum = 0;

        while (true) {
            a = Integer.parseInt(reader.readLine());
            if (a != -1) {
                sum += a;
            } else {
                break;
            }
            count++;
        }

        System.out.println(sum / count);
    }
}

