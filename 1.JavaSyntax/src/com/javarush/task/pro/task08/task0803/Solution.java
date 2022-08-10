package com.javarush.task.pro.task08.task0803;

import java.util.Arrays;
import java.util.Scanner;

/* 
Минимальный элемент массива
*/

public class Solution {

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        int temp = ints[0];
        for (int i = 0; i < ints.length; i++) {
            temp = Math.min(temp, ints[i]);
        }
        return temp;
    }

    public static int[] getArrayOfTenElements() {
        Scanner console = new Scanner(System.in);
        int[] arrayOfTenElements = new int[10];
        for (int i = 0; i < arrayOfTenElements.length; i++) {
            arrayOfTenElements[i] = console.nextInt();
        }
        return arrayOfTenElements;
    }
}
