package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "b");
        map.put("a1", "b1");
        map.put("a2", "b2");
        map.put("a3", "b3");
        map.put("a4", "b");
        map.put("a5", "b4");
        map.put("a6", "b5");
        map.put("a7", "b");
        map.put("a8", "b6");
        map.put("a9", "b7");
        return map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код
        ArrayList<String> names = new ArrayList<>(map.values());

        for (int i = names.size() - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (names.get(i).equals(names.get(j))) {
                    removeItemFromMapByValue(map, names.get(i));
                }
            }
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
