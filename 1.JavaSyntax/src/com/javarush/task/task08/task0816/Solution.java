package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));

        //напишите тут ваш код
        map.put("Stallone1", new Date("JUNE 1 1980"));
        map.put("Stallone2", new Date("MAY 1 1981"));
        map.put("Stallone3", new Date("MAY 1 1983"));
        map.put("Stallone4", new Date("JUNE 1 1984"));
        map.put("Stallone5", new Date("MAY 1 1985"));
        map.put("Stallone6", new Date("MAY 1 1986"));
        map.put("Stallone7", new Date("MAY 1 1987"));
        map.put("Stallone8", new Date("MAY 1 1989"));
        map.put("Stallone9", new Date("JUNE 1 1982"));
        return map;

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        HashMap<String, Date> map1 = new HashMap<>(map);
        for (HashMap.Entry<String, Date> pair : map1.entrySet()) {
            if (pair.getValue().getMonth() > 4 && pair.getValue().getMonth() < 8) {
                map.remove(pair.getKey());
            }
        }

    }

    public static void main(String[] args) {

    }
}
