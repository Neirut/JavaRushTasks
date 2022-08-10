package com.javarush.task.pro.task06.task0605;

/* 
Правильный порядок
*/

import java.lang.reflect.Array;

public class Solution {

    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        int[] temp = new int[array.length];
        int b = array.length;
        for (int j : array) {
            b--;
            temp[b] = j;
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = temp[i];
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
