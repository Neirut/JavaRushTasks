package com.javarush.task.pro.task04.task0411;

/* 
Четные числа
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int i = 0;
        while (i <= 20)
        {
            i++;
            if ( (i % 7) == 0) continue;
            System.out.println(i);

        }

    }
}