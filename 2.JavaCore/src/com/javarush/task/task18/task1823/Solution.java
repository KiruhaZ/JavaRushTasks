package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while (!(s = reader.readLine()).equals("exit")) {
            new ReadThread(s).start();
        }
        reader.close();
    }

    public static class ReadThread extends Thread {
        private String fileName;
        public ReadThread(String fileName) {
            //implement constructor body
            this.fileName = fileName;
        }
        // implement file reading here - реализуйте чтение из файла тут


        @Override
        public void run() {
            try {
                FileInputStream inputStream = new FileInputStream(fileName);
                TreeMap<Integer, Integer> map = new TreeMap<>();
                while (inputStream.available() > 0) {
                    int temp = inputStream.read();
                    if (map.containsKey(temp)) {
                        map.put(temp, map.get(temp) + 1);
                    } else {
                        map.put(temp, 1);
                    }
                }
                inputStream.close();

                int count = 0;
                int maxByte = 0;
                for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
                    if (count < pair.getValue()) {
                        count = pair.getValue();
                        maxByte = pair.getKey();
                    }
                }

                synchronized (resultMap) {
                    resultMap.put(fileName, maxByte);
                }


            } catch (FileNotFoundException e) {

            } catch (IOException e) {

            }
        }
    }
}
