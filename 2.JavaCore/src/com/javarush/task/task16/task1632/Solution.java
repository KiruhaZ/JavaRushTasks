package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new T1());
        threads.add(new T2());
        threads.add(new T3());
        threads.add(new T4());
        threads.add(new T5());
    }

    public static void main(String[] args) {
    }

    public static class T1 extends Thread {
        @Override
        public void run() {
            while (!interrupted()) {

            }
        }
    }

    public static class T2 extends Thread {
        @Override
        public void run() {
            while (true) {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("InterruptedException");
                    break;
                }
            }
        }
    }

    public static class T3 extends Thread {
        @Override
        public void run() {
            try {
                while (!interrupted()) {
                    System.out.println("Ура");
                    sleep(500);
                }
            } catch (InterruptedException e) {

            }
        }
    }

    public static class T4 extends Thread implements Message{
        private volatile boolean start;

        public T4() {
            start = true;
        }

        @Override
        public void showWarning() {
            start = false;
        }

        @Override
        public void run() {
            while (start) {

            }
        }
    }

    public static class T5 extends Thread {
        @Override
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            try {
                int sum = 0;

                while (!interrupted()) {
                    String s = reader.readLine();
                    if (s.equals("N")) {
                        break;
                    }

                    try {
                        int x = Integer.parseInt(s);
                        sum += x;
                    } catch (NumberFormatException e) {

                    }
                }

                System.out.println(sum);
            } catch (IOException e) {

            }
        }
    }





}