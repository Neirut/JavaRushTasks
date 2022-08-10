package com.javarush.task.pro.task09.task0917;

/* 
String pool
*/

public class Solution {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Привет");
        builder.append(123);
        System.out.println(builder);
        String result = builder.toString();
        System.out.println(result);
    }
}
