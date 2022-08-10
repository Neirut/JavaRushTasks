package com.javarush.task.pro.task09.task0912;

/* 
Проверка URL-адреса
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner("https://domen.ru/about/reviews");
        String path = console.nextLine();

        int index = path.indexOf("//");
        System.out.println("index " + index);

        int index2 = path.indexOf("/", index + 2);
        System.out.println("index2 " + index2);

        String first = path.substring(0, index + 2);
        System.out.println("first " + first);
        String last = path.substring(index2);
        System.out.println("last " + last);

        String result = first + "javarush.ru" + last;
        System.out.println(result);
        }
}
