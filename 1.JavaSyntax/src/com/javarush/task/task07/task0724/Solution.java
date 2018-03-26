package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human ded1 = new Human("Ded1", true, 71);
        Human ded2 = new Human("Ded2", true, 70);
        Human babka1 = new Human("Babka1", false, 65);
        Human babka2 = new Human("Babka2", false, 66);
        Human dad = new Human("Dad", true, 43, ded1, babka1);
        Human mom = new Human("Mom", false, 40, ded2, babka2);
        Human son1 = new Human("Son1", true, 17, dad, mom);
        Human son2 = new Human("Son2", true, 15, dad, mom);
        Human daughter = new Human("Daughter", false, 12, dad, mom);


        System.out.println(ded1);
        System.out.println(ded2);
        System.out.println(babka1);
        System.out.println(babka2);
        System.out.println(dad);
        System.out.println(mom);
        System.out.println(son1);
        System.out.println(son2);
        System.out.println(daughter);
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















