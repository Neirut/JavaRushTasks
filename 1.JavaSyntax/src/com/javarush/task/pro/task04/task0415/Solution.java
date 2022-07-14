package com.javarush.task.pro.task04.task0415;

import java.util.Scanner;

/* 
Площадь круга
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int radius = console.nextInt();
        if(radius > 0){
            double pi = 3.14;
            double s = pi * radius * radius;
            int x = (int)(s);
            System.out.println(x);
        } else {
            System.out.println("Число должно быть положительным!");
        }
    }
}