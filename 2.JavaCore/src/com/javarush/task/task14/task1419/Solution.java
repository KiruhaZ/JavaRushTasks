package com.javarush.task.task14.task1419;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            reader.close();
            String s = reader.readLine();
//            Scanner file=new Scanner(new File("d:\\1.txt"));
//            while(!file.next().equals("equaller")){
//                file.next();
//            }
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int[] p =  new int[-2];
            p[-3]=5;
        } catch (Exception e) {
            exceptions.add(e);
        }

        try  {
            FileInputStream fis = null;
            fis = new FileInputStream("d:/21.txt");

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int result = getValue(-1, 100);
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            String[] ar = new String[2];
            int firstNumber = Integer.parseInt(ar[0]);
            int secondNumber = Integer.parseInt(ar[1]);
            if (firstNumber >= 0 && secondNumber >= 0) {
                int add = firstNumber + secondNumber;
                System.out.println("Addition Is : " + add);
            }
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {

            int[] arr = new int[2];
            for (int i = 0; i < 8; i++) {
                arr[i] = i;
            }
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Object ch = new Character('*');
            System.out.println((Byte) ch);
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int[] n = new int[5];
            n = null;
            int i = n.length;
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            String s = "123";
            char c = s.charAt(10);
        } catch (Exception e) {
            exceptions.add(e);
        }
    }


    public static int getValue(int x, int y) {
        if (x < 0 || y < 0) throw new IllegalArgumentException();

        return x*y;
    }

}
