package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] n = new int[console.nextInt()];
        for (int i = 0; i < n.length; i++) {
                n[i] = console.nextInt();
        }
        if (n.length%2 == 0){
            for (int i = n.length; i > 0; i--) {
                System.out.println(n[i - 1]);
            }
            } else {
            for (int i = 0; i < n.length; i++) {
                System.out.println(n[i]);
            }
        }
    }
}
