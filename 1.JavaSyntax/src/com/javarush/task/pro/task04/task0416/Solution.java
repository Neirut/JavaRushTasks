package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {
        Scanner concole = new Scanner(System.in);
        int count = concole.nextInt();
        int people = concole.nextInt();
        double countPeople = count * 1.0 / people;
        System.out.println(countPeople);

    }
}