package com.javarush.task.task17.task1710;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws IOException, ParseException {
        while (true) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String text = bufferedReader.readLine();
            String mas[] = text.split(" ");
            if (mas[0].equals("-c")) {
                if (mas[2].equals("м")) {
                    allPeople.add(Person.createMale(mas[1], new SimpleDateFormat("dd/mm/yyyy", Locale.ENGLISH).parse(mas[3])));  //сегодня родился    id=0
                } else if (mas[2].equals("ж")) {
                    allPeople.add(Person.createFemale(mas[1], new SimpleDateFormat("dd/mm/yyyy", Locale.ENGLISH).parse(mas[3])));
                } else break;
                System.out.println(allPeople.size() - 1);
            } else if (mas[0].equals("-u"))
                System.out.println("-u good");
            else if (mas[0].equals("-d"))
                System.out.println("-d good");
            else if (mas[0].equals("-i"))
                System.out.println("-i good");
            else
                System.out.println("Error Comand");
        }
    }
}
