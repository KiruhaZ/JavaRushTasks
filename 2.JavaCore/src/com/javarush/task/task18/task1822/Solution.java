package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(reader.readLine());
        reader.close();
        reader = new BufferedReader(fileReader);
        String s;

        while ((s = reader.readLine()) != null) {
            if (s.startsWith(args[0] + " ")) {
                System.out.println(s);
                break;
            }
        }

        reader.close();
        fileReader.close();
    }
}
