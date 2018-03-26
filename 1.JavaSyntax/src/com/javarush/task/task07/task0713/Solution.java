package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> bigList = new ArrayList<>();
        ArrayList<Integer> listFor3 = new ArrayList<>();
        ArrayList<Integer> listFor2 = new ArrayList<>();
        ArrayList<Integer> listForNon = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            bigList.add(Integer.parseInt(reader.readLine()));

            if (bigList.get(i) % 3 == 0 && bigList.get(i) % 2 == 0) {
                listFor2.add(bigList.get(i));
                listFor3.add(bigList.get(i));
            } else if (bigList.get(i) % 3 == 0) {
                listFor3.add(bigList.get(i));
            } else if (bigList.get(i) % 2 == 0) {
                listFor2.add(bigList.get(i));
            } else {
                listForNon.add(bigList.get(i));
            }
        }

        printList(listFor3);
        printList(listFor2);
        printList(listForNon);

    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (int a : list) {
            System.out.println(a);
        }
    }
}
