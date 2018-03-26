package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        //напишите тут ваш код
        ArrayList<Integer> num = new ArrayList<>();
        ArrayList<String> str = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) {
                num.add(Integer.parseInt(array[i]));
            } else {
                str.add(array[i]);
            }
        }

        Collections.sort(num);
        Collections.reverse(num);

        String[] str1 = new String[str.size()];
        for (int i = 0; i < str.size(); i++) {
            str1[i] = str.get(i);
        }

        for (int i = str1.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (isGreaterThan(str1[j], str1[j + 1])) {
                    String s = str1[j];
                    str1[j] = str1[j + 1];
                    str1[j + 1] = s;
                }

            }
        }

        String[] res = new String[array.length];

        int indI = 0;
        int indS = 0;
        for (int i = 0; i < array.length; i++) {

            if (isNumber(array[i])) {
                res[i] = Integer.toString(num.get(indI));
                indI++;
            } else {
                res[i] = str1[indS];
                indS++;
            }
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = res[i];
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-')) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
