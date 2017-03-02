package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        double summ = 0;
        int count = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            double number = Double.parseDouble(bufferedReader.readLine());
            if(number != -1){
                summ+=number;
                count++;
            }
            else
            {
                System.out.println(summ/count);
                break;
            }
        }
    }
}

