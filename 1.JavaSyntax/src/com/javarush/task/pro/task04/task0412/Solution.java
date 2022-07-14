package com.javarush.task.pro.task04.task0412;

import java.util.Scanner;

/* 
Сумма кратных чисел
*/

public class Solution {
    public static void main(String[] args) {
        int f = 1;
        for (int i = 1; i <= 5; i++)
            f = f * i;
        System.out.println(f);
    }
}