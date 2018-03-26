package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        //Add your code here - добавьте свой код тут
        SpecialThread thread = new SpecialThread();
        SpecialThread thread1 = new SpecialThread();
        SpecialThread thread2 = new SpecialThread();
        SpecialThread thread3 = new SpecialThread();
        SpecialThread thread4 = new SpecialThread();

        Thread thread01 = new Thread(thread);
        Thread thread02 = new Thread(thread1);
        Thread thread03 = new Thread(thread2);
        Thread thread04 = new Thread(thread3);
        Thread thread05 = new Thread(thread4);

        list.add(thread01);
        list.add(thread02);
        list.add(thread03);
        list.add(thread04);
        list.add(thread05);
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
