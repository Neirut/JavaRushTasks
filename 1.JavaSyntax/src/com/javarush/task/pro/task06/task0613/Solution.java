package com.javarush.task.pro.task06.task0613;

/* 
Города-гиганты
*/

public class Solution {


    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6};
        data = new int[]{6, 7, 8, 9};
        data[0] = 0;
        data[1] = 0;
        data[2] = 0;
        for (int i : data) {
            System.out.println(i + " ");
        }
    }

}
