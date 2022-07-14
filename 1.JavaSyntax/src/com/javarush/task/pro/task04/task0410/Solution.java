package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstScan = scan.nextInt();
        int secondScan = scan.nextInt();
        int first_min = firstScan <= secondScan ? firstScan : secondScan;
        int second_min = firstScan >= secondScan ? firstScan : secondScan;
        while(scan.hasNextInt()){
                int inp = scan.nextInt();
                if (first_min == second_min){
                    if(inp < first_min){
                        first_min = inp;
                    } else {
                        second_min = inp;
                    }
                } else if(inp < first_min){
                    second_min = first_min;
                    first_min = inp;
                } else if (inp > first_min && inp < second_min){
                    second_min = inp;
                }
        }
        System.out.println(second_min);
    }
}
