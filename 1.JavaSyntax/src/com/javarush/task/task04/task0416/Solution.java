package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        float a = Float.parseFloat(reader.readLine());

        if (a > 6) {
            do {
                a = a - 5;
            } while (a > 6.0);
        }

        if (a < 3.0) {
            System.out.println("зеленый");
        }else if (a>=3.0 & a<4.0) {
            System.out.println("желтый");
        } else {
            System.out.println("красный");
        }

    }
}