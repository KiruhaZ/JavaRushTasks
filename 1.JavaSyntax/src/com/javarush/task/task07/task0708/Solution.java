package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;

        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
            if (i == 0) {
                a = strings.get(i).length();
            } else if (a < strings.get(i).length()) {
                a = strings.get(i).length();
            }
        }

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == a) {
                System.out.println(strings.get(i));
            }
        }
    }
}
