package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandDadName = reader.readLine();
        Cat grandDad = new Cat(grandDadName);

        String grandMomName = reader.readLine();
        Cat grandMom = new Cat(grandMomName);

        String dadName = reader.readLine();
        Cat dad = new Cat(dadName, null, grandDad);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, grandMom, null);

        String sonName = reader.readLine();
        Cat son = new Cat(sonName, catMother, dad);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, dad);

        System.out.println(grandDad);
        System.out.println(grandMom);
        System.out.println(dad);
        System.out.println(catMother);
        System.out.println(son);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat mom, Cat dad) {
            this.name = name;
            this.mother = mom;
            this.father = dad;
        }

        @Override
        public String toString() {
            if (mother == null && father == null) {
                return "Cat name is " + name + ", no mother, no father";
            } else if (father == null && mother != null){
                return "Cat name is " + name + ", mother is " + mother.name + ", no father";
            } else if (mother == null && father != null) {
                return "Cat name is " + name + ", no mother, father is " + father.name;
            } else {
                return "Cat name is " + name + ", mother is " + mother.name + ", father is " + father.name;
            }
        }
    }

}
