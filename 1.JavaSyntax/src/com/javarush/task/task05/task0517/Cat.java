package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код
    String name;
    int age;
    int weight;
    String address;
    String color;

    public Cat(String name) {
        this.name = name;
        this.age = 2;
        this.weight = 2;
        this.color = "braun";
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "braun";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 2;
        this.color = "braun";
    }

    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 2;
    }

    public Cat(int weight, String color, String address) {
        this.weight = weight;
        this.address = address;
        this.color = color;
        this.age = 2;
    }

    public static void main(String[] args) {

    }
}
