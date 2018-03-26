package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> monthInYear = new HashMap<String, Integer>();
        monthInYear.put("January", 1);
        monthInYear.put("February", 2);
        monthInYear.put("March", 3);
        monthInYear.put("April", 4);
        monthInYear.put("May", 5);
        monthInYear.put("June", 6);
        monthInYear.put("July", 7);
        monthInYear.put("August", 8);
        monthInYear.put("September", 9);
        monthInYear.put("October", 10);
        monthInYear.put("November", 11);
        monthInYear.put("December", 12);

        String month = reader.readLine();

        System.out.println(month + " is " + monthInYear.get(month) + " month");
    }
}
