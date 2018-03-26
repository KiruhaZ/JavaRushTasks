package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date date1 = new Date(date);

        String newYear = "JANUARY 1 ";
        newYear += date1.getYear();
        Date date2 = new Date(newYear);

        long res = (date1.getTime() - date2.getTime()) / 1000 / 60 / 60 / 24;
        return res % 2 == 0;
    }
}
