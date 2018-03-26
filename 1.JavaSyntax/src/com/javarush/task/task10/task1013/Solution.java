package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private String name;
        private String lastName;
        private boolean sex;
        private int age;
        private String addres;
        private long phone;

        public Human() {
        }

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, String lastName) {
            this.name = name;
            this.lastName = lastName;
        }

        public Human(String name, String lastName, boolean sex) {
            this.name = name;
            this.lastName = lastName;
            this.sex = sex;
        }

        public Human(String name, String lastName, boolean sex, int age) {
            this.name = name;
            this.lastName = lastName;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, String lastName, boolean sex, int age, String addres) {
            this.name = name;
            this.lastName = lastName;
            this.sex = sex;
            this.age = age;
            this.addres = addres;
        }

        public Human(String name, String lastName, boolean sex, int age, String addres, long phone) {
            this.name = name;
            this.lastName = lastName;
            this.sex = sex;
            this.age = age;
            this.addres = addres;
            this.phone = phone;
        }

        public Human(String name, String lastName, long phone) {
            this.name = name;
            this.lastName = lastName;
            this.phone = phone;
        }

        public Human(String name, String lastName, int age) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, long phone) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.phone = phone;
        }
    }
}
