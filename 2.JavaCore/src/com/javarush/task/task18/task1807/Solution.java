package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream stream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int count = 0;
        while (stream.available() > 0) {
            int temp = stream.read();
            if (temp == 44) {
                count++;
            }
        }
        stream.close();

        System.out.println(count);

    }
}
