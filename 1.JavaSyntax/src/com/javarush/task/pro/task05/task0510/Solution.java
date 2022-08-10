package com.javarush.task.pro.task05.task0510;

/* 
Треугольный массив
*/

public class Solution {

    public static int[][] result = new int[10][];

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            result[i] = new int[i + 1];
            for (int j = 0; j < result[i].length; j++) {



                if (j == i) {
                    result[i][j] = i;
                } else {
                        result[i][j] = i + j;
            }



                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
