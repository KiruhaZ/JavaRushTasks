package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException{
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader readerFile = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())));
        ArrayList<Integer> list = new ArrayList<>();
        int data;

        while (readerFile.ready()) {
            data = Integer.parseInt(readerFile.readLine());

            if (data % 2 == 0) {
                list.add(data);
            }

        }
        reader.close();
        readerFile.close();
        Collections.sort(list);

        for (int i : list) {
            System.out.println(i);
        }

    }
}
