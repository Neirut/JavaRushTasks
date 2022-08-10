package com.javarush.task.pro.task05.task0517;

import java.util.Arrays;

/* 
Делим массив
*/

public class Solution {

    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public static void main(String[] args) {
        int[] temp1;
        int[] temp2;
        if(array.length%2 == 0){
            temp1 = Arrays.copyOfRange(array, 0, array.length/2);
            temp2 = Arrays.copyOfRange(array, array.length/2, array.length);
        } else {
            temp1 = Arrays.copyOfRange(array, 0, (array.length+1)/2);
            temp2 = Arrays.copyOfRange(array, (array.length+1)/2, array.length);
        }
        result[0] = Arrays.copyOfRange(temp1, 0, temp1.length);
        result[1] = Arrays.copyOfRange(temp2, 0, temp2.length);
        System.out.println(Arrays.deepToString(result));
    }
}
