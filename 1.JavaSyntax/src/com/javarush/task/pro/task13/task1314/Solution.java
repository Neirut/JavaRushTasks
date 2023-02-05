package com.javarush.task.pro.task13.task1314;

/* 
StringsLinkedList, часть 2
*/

public class Solution {

    public static void main(String[] args) {
        StringsLinkedList stringsLinkedList = new StringsLinkedList();
        stringsLinkedList.add("1 элемент");
        stringsLinkedList.add("2 элемент");
        stringsLinkedList.add("3 элемент");
        stringsLinkedList.add("4 элемент");
        stringsLinkedList.add("5 элемент");
        stringsLinkedList.add("6 элемент");
        stringsLinkedList.add("7 элемент");
        stringsLinkedList.add("8 элемент");
        stringsLinkedList.add("9 элемент");
        System.out.println(stringsLinkedList.get(-5)); // 5
    }
}
