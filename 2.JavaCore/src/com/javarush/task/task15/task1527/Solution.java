package com.javarush.task.task15.task1527;

import java.io.*;
import java.net.*;


/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        reader.close();

        String[] params = s.split("\\?")[1].split("&");

        for (String param : params) {
            System.out.print(param.split("=")[0] + " ");
        }
        System.out.println();

        for (String param : params) {
            if ("obj".equals(param.split("=")[0])) {
                try {
                    alert(Double.parseDouble(param.split("=")[1]));
                } catch (NumberFormatException e) {
                    alert(param.split("=")[1]);
                }
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
