package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        while (true) {
            FileInputStream in = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());


            if (in.available() < 1000) {
                in.close();
                throw new DownloadException();
            }
            in.close();
        }
    }

    public static class DownloadException extends Exception {

    }
}
