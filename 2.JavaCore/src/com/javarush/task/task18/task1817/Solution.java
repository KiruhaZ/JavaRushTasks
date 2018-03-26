package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        String fileName = args[0];

        try {
            FileReader reader = new FileReader(args[0]);
            double chars = 0;
            double spaces = 0;

            while (reader.ready()) {
                char c = (char) reader.read();
                if (c == ' ') {
                    spaces++;
                }
                chars++;
            }

            reader.close();

            System.out.printf("%.2f", ((spaces / chars) * 100));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
