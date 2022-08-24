package com.javarush.task.pro.task12.task1210;

import java.util.ArrayList;
import java.util.Collections;

/* 
Переворачивание данных
*/

public class Solution {
    public static ArrayList<Integer> numbers = new ArrayList<Integer>();

    public static void main(String[] args) {
        init();
//        print();
        System.out.println(numbers);

        reverse();
//        print();
        System.out.println(numbers);
    }

    public static void init() {
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
    }

    public static void reverse() {
        Collections.reverse(numbers);
    }

    private static void print() {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
