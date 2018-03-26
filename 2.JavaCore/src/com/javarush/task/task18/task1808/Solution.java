package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream stream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        FileOutputStream stream1 = new FileOutputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        FileOutputStream stream2 = new FileOutputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());

        byte[] bytes = new byte[1000];
        if (stream.available() > 0) {
            int count = stream.read(bytes);
            int count1 = count - count / 2;
            int count2 = count - (count - count / 2);
            stream1.write(bytes, 0, count1);
            stream2.write(bytes, count1, count2);
        }

        stream.close();
        stream1.close();
        stream2.close();
    }
}
