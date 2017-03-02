package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        int count = 0;
        while (fileInputStream.available() > 0){
            int b = fileInputStream.read();
            if(b >= 65 && b <=90)
                count++;
            else if (b >= 97 && b <= 122)
                count++;
        }
        System.out.println(count);
        fileInputStream.close();
    }
}
