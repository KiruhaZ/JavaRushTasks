package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName1 = new BufferedReader(new InputStreamReader(System.in)).readLine();
        String fileName2 = new BufferedReader(new InputStreamReader(System.in)).readLine();

        FileInputStream inputStream = new FileInputStream(fileName1);
        byte[] bytes1 = new byte[inputStream.available()];
        inputStream.read(bytes1);
        inputStream.close();

        inputStream = new FileInputStream(fileName2);
        byte[] bytes2 = new byte[inputStream.available()];
        inputStream.read(bytes2);
        inputStream.close();

        FileOutputStream outputStream = new FileOutputStream(fileName1);
        outputStream.write(bytes2);
        outputStream.close();

        outputStream = new FileOutputStream(fileName1, true);
        outputStream.write(bytes1);
        outputStream.close();



    }
}
