package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //напишите тут ваш код
        StringBuilder builder = new StringBuilder();

        String[] array = s.split("\\s+");


        for (int i = 0; i < array.length; i++) {
            if (!array[i].isEmpty())
                builder.append(array[i].substring(0, 1).toUpperCase()).append(array[i].substring(1)).append(" ");
        }
        System.out.println(builder);
    }
}
