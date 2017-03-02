package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int list[] = new int[15];
        int a=0, b=0;
        Scanner sc = new Scanner(System.in); //напишите тут ваш код
        for (int i = 0; i <list.length ; i++) {
            list[i]=sc.nextInt();
            if (i%2==0) a=a+list[i];
            else b=b+list[i];
        }
        if (a>b) System.out.println("В домах с четными номерами проживает больше жителей.");
        else System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}