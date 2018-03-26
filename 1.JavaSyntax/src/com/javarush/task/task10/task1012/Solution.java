package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        // напишите тут ваш код
        ArrayList<Integer> count = new ArrayList<>();
        for (int i = 0; i < 33; i++) {
            count.add(0);
        }

        for (String s : list) {
            char [] arr = s.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < 33; j++) {
                    if (arr[i] == alphabet.get(j)) {
                        count.set(j, count.get(j) + 1);
                    }
                }

            }
        }

        for (int i = 0; i < alphabet.size(); i++) {
            System.out.println(alphabet.get(i) + " " + count.get(i));
        }
    }

}
