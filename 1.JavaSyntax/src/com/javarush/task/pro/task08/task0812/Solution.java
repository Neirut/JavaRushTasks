package com.javarush.task.pro.task08.task0812;

/* 
Swap по-новому
*/

import java.util.Arrays;

class Solution
{
    public static int[] cript(int[] data, int password)
    {
        int[] result = new int[data.length];
        for (int i = 0; i <  data.length; i++)
            result[i] = data[i] ^ password;
        return result;
    }

    public static void main(String[] args)
    {
        int[] data =  {1, 3, 5, 7, 9, 11};
        int password = 199;

        // зашифровываем массив данных
        int[] encrypted = cript(data, password) ;
        System.out.println(Arrays.toString(encrypted));

        // расшифровываем массив данных
        int[] decrypted = cript(encrypted, password) ;
        System.out.println(Arrays.toString(decrypted));
    }
}
