package com.javarush.task.task12.task1209;

/* 
Три метода и минимум
*/

public class Solution {
    public static void main(String[] args) {

    }

    //Напишите тут ваши методы
    static int min(int x, int y) {
        if (x > y) {
            return y;
        } else {
            return x;
        }
    }

    static long min(long x, long y) {
        if (x > y) {
            return y;
        } else {
            return x;
        }
    }

    static double min(double x, double y) {
        if (x > y) {
            return y;
        } else {
            return x;
        }
    }
}
