package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        FileOutputStream outStream = new FileOutputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());

        byte[] bytes = new byte[1000];
        int j = 0;
        if (inStream.available() > 0) {
            j = inStream.read(bytes);
        }

        for (int i = j - 1; i >= 0 ; i--) {
            outStream.write(bytes[i]);
        }



        inStream.close();
        outStream.close();
    }
}
