package com.javarush.task.pro.task05.task0519;

import java.util.Arrays;

/* 
Есть ли кто?
*/

public class Solution {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {
        int[] temp = Arrays.copyOf(array, array.length);
                Arrays.sort(temp);
        boolean x = Arrays.binarySearch(temp, element) >= 0;
        System.out.println(x);
    }
}
