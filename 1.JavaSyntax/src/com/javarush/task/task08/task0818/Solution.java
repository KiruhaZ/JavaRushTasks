package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 500);
        map.put("a1", 50);
        map.put("a2", 510);
        map.put("a3", 50);
        map.put("a4", 600);
        map.put("a5", 60);
        map.put("a6", 100);
        map.put("a7", 200);
        map.put("a8", 700);
        map.put("a9", 800);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        HashMap<String, Integer> map1 = new HashMap<>(map);
        for (HashMap.Entry<String, Integer> pair : map1.entrySet()) {
            if (pair.getValue() < 500) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}