package com.javarush.task.pro.task04.task0406;

import java.util.Scanner;

/* 
Показываем, что получаем
*/

public class Solution {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 20)
        {
            i++;
            if ( (i % 7) == 0 )
                continue;
            System.out.println(i);
        }
    }
}