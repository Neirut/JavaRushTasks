package com.javarush.task.pro.task04.task0417;

import java.util.Scanner;

/* 
Скорость ветра
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int ms = console.nextInt();
        double kch = ms * 3.6;
        int round = (int)Math.round(kch);
        System.out.println(round);
    }
}