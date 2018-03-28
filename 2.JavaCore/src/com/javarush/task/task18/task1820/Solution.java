package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inFile = reader.readLine();
        String outFile = reader.readLine();
        reader.close();

        ArrayList<String> strings = new ArrayList<>();
        reader = new BufferedReader(new FileReader(inFile));
        while (reader.ready()) {
            strings.add(reader.readLine());
        }
        reader.close();

        ArrayList<Long> longs = new ArrayList<>();
        for (String string : strings) {
            for (String split : string.split(" ")) {
                double d = Double.parseDouble(split);
                longs.add(Math.round(d));
            }
        }

        FileWriter writer = new FileWriter(outFile);
        for (Long l : longs) {
            writer.write(l.toString() + " ");
        }
        writer.close();


    }
}
