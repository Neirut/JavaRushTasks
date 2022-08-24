package com.javarush.task.pro.task12.task1206;

/* 
Анализ строк
*/

public class Solution {
    public static void main(String[] args) {
        String string = "a1a aa" +
                "a  2";

        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        int result = 0;
        for (char elements: string.toCharArray()) {
            if (Character.isDigit(elements)){
                result ++;
            }
        }
        return result;
    }

    public static int countLetters(String string) {
        int result = 0;
        for (char elements: string.toCharArray()) {
            if (Character.isAlphabetic(elements)){
                result ++;
            }
        }
        return result;
    }

    public static int countSpaces(String string) {
        int result = 0;
        for (char elements: string.toCharArray()) {
            if (Character.isWhitespace(elements)){
                result ++;
            }
        }
        return result;
    }
}
