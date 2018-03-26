package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут
        if (args.length == 0) {
            System.out.println("Нет аргументов");
        }

        switch (args[0]) {
            case "-c": {
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 3) {
                        addPerson(args[i], args[i + 1], args[i + 2]);
                    }

                }
                break;
            }
            case "-u":{
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 4) {
                        updatePerson(args[i], args[i + 1], args[i + 2], args[i + 3]);
                    }
                }
                break;
            }
            case "-d": {
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        deletePerson(args[i]);
                    }
                }
                break;
            }
            case "-i" : {
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        showPerson(args[i]);
                    }
                }
                break;
            }

        }



    }

    static Date dateFormat(String bd) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Date date = new Date();
        try {
            date = dateFormat.parse(bd);
        } catch (ParseException e) {

        }
        return date;
    }

    public static void addPerson(String name, String sex, String bd) {
        if (sex.equals("м")) {
            allPeople.add(Person.createMale(name, dateFormat(bd)));
        } else {
            allPeople.add(Person.createFemale(name, dateFormat(bd)));
        }
        System.out.println(allPeople.size() - 1);
    }

    public static void updatePerson(String id, String name, String sex, String bd) {
        int i = Integer.parseInt(id);
        allPeople.get(i).setName(name);
        if (sex.equals("м")) {
            allPeople.get(i).setSex(Sex.MALE);
        } else {
            allPeople.get(i).setSex(Sex.FEMALE);
        }
        allPeople.get(i).setBirthDay(dateFormat(bd));
    }

    public static void deletePerson(String id) {
        int i = Integer.parseInt(id);
        allPeople.get(i).setSex(null);
        allPeople.get(i).setName(null);
        allPeople.get(i).setBirthDay(null);
    }

    public static void showPerson(String id) {
        int i = Integer.parseInt(id);
        String sex;
        if (allPeople.get(i).getSex().equals(Sex.MALE)) {
            sex = " м ";
        } else {
            sex = " ж ";
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        String date = dateFormat.format(allPeople.get(i).getBirthDay());
        System.out.println(allPeople.get(i).getName() + sex + date);
    }
}
