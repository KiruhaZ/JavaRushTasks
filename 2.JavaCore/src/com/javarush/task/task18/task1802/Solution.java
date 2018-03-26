package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream stream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int min = 0;
        for (int i = 0; stream.available() > 0; i++) {
            int temp = stream.read();
            if (i == 0) {
                min = temp;
            }
            if (min > temp) {
                min = temp;
            }
        }
        stream.close();
        System.out.println(min);
    }
}
