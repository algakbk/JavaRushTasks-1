package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        int count = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = bufferedReader.readLine();
            FileReader fileReader = new FileReader(s);
            String temp = null;
            while(fileReader.ready()){
                temp += fileReader.read();
            }
            String[] split = temp.split(",");
            for(int i = 0; i < split.length; i++){
                if(split[i].contains("world"))
                    count++;
            }
            //Вывод к-ва строк
            System.out.println(count);
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
