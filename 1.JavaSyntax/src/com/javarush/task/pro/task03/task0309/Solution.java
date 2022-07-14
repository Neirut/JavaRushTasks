package com.javarush.task.pro.task03.task0309;


import java.util.Locale;
import java.util.Scanner;
/* 
Ищем максимум
*/


public class Solution {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        boolean enter = false;
        int a = 0;
        while(!enter){
            String text = Scanner.nextLine();
            if (text.equalsIgnoreCase("ENTER")){
                enter = true;
                System.out.println(a);}
            else a += Integer.parseInt(text.trim());

        }

    }
}

