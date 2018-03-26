package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();

        FileInputStream inputStream = new FileInputStream(fileName2);
        FileOutputStream outputStream = new FileOutputStream(fileName1);


        while (inputStream.available() > 0) {
            int x = inputStream.read();
            outputStream.write(x);
        }

        inputStream.close();
        inputStream = new FileInputStream(fileName3);

        while (inputStream.available() > 0) {
            int x = inputStream.read();
            outputStream.write(x);
        }

        reader.close();
        inputStream.close();
        outputStream.close();
    }
}
