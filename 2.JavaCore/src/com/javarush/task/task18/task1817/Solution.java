package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        int count = 0;
        int countSpace = 0;
        FileInputStream fileReader = new FileInputStream(args[0]);
        int x = 0;
        while(fileReader.available() > 0){
            x = fileReader.read();
            if(x == 32)
                countSpace++;
            count++;
        }
       double result = (double)countSpace/count * 100;
        System.out.printf("%.2f",result);
        fileReader.close();
    }
}
