package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory implements Country{

        static Hen getHen(String country) {
            if (country.equals(Country.BELARUS)) {
                return new BelarusianHen();
            } else if (country.equals(Country.MOLDOVA)) {
                return new MoldovanHen();
            } else if (country.equals(Country.RUSSIA)) {
                return new RussianHen();
            } else if (country.equals(Country.UKRAINE)) {
                return new UkrainianHen();
            } else {
                return null;
            }
        }
    }


}
