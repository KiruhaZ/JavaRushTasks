package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream stream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        while (stream.available() > 0) {
            set.add(stream.read());
        }

        stream.close();

        list.addAll(set);
        Collections.sort(list);

        for (Integer i : list) {
            System.out.print(i + " ");
        }

    }
}
