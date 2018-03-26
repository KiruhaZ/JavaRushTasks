package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        //напишите тут ваш код
        maximum = 0;
        minimum = 0;
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(reader.readLine());

            if (i == 0) {
                maximum = arr[i];
                minimum = arr[i];
            }

            if (maximum < arr[i]){
                maximum = arr[i];
            }
            if (minimum > arr[i]) {
                minimum = arr[i];
            }
        }

        System.out.println(maximum);
        System.out.println(minimum);
    }
}
