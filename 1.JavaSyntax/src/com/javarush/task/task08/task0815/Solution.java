package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("D","D1");
        map.put("f","D2");
        map.put("g","D3");
        map.put("j","D4");
        map.put("r","D5");
        map.put("e","D6");
        map.put("w","D7");
        map.put("t","D1");
        map.put("x","D8");
        map.put("wq","D9");
        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int a = 0;
        for (HashMap.Entry<String, String> pair : map.entrySet()) {
            if (pair.getValue().equals(name)) {
                a++;
            }
        }
        return a;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int a = 0;
        for (HashMap.Entry<String, String> pair : map.entrySet()) {
            if (pair.getKey().equals(lastName)) {
                a++;
            }
        }
        return a;

    }

    public static void main(String[] args) {

    }
}
