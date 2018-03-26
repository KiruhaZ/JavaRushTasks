package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream stream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        HashMap<Integer, Integer> map = new HashMap<>();
        int temp = 0;
        while (stream.available() > 0) {
            temp = stream.read();
            if (map.containsKey(temp)) {
                map.put(temp, map.get(temp) + 1);
            } else {
                map.put(temp, 1);
            }
        }
        stream.close();
        Integer min = Collections.min(map.values());
        for (Integer i : map.keySet()) {
            if (min == map.get(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
