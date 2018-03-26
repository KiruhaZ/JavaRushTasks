package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;

/* 
Самые частые байты
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
        Integer max = Collections.max(map.values());
        for (Integer i : map.keySet()) {
            if (map.get(i) == max) {
                System.out.print(" " + i + " ");
            }
        }

    }
}
