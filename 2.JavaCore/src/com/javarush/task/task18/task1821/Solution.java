package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[0]);
        TreeMap<Byte, Integer> map = new TreeMap<>();

        byte[] bytes = new byte[inputStream.available()];
        while (inputStream.available() > 0) {
            inputStream.read(bytes);
        }
        inputStream.close();

        for (int i = 0; i < bytes.length; i++) {
            if (map.containsKey(bytes[i])) {
                map.put(bytes[i], map.get(bytes[i]) + 1);
            } else {
                map.put(bytes[i], 1);
            }

        }

        for (Map.Entry pair : map.entrySet()) {
            char c = (char)((byte)pair.getKey());
            System.out.println(c + " " + pair.getValue());
        }


    }
}
