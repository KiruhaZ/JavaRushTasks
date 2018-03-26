package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        String name = args[0];
        int count = 0;

        try (InputStreamReader reader = new InputStreamReader(new FileInputStream(name))) {
            while (reader.ready()) {
                char c = (char) reader.read();
                if ("abcdefghijklmnopqrstuvwxyz".indexOf(Character.toLowerCase(c)) > -1) {
                    count++;
                }
            }
            System.out.println(count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
