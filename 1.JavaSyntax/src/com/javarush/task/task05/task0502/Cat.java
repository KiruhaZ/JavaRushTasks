package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        int sum = 0;

        if (age > anotherCat.age) {
            sum++;
        } else {
            sum--;
        }

        if (weight > anotherCat.weight) {
            sum++;
        } else {
            sum--;
        }

        if (strength > anotherCat.strength) {
            sum++;
        } else {
            sum--;
        }

        if (sum > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

    }
}
