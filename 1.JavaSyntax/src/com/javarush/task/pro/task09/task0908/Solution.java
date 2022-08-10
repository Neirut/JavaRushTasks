package com.javarush.task.pro.task09.task0908;

import java.util.Arrays;
import java.util.regex.Pattern;

/* 
Двоично-шестнадцатеричный конвертер
*/

public class Solution {

    public static void main(String[] args) {
        String binaryNumber = "111111111111";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "fff";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String[] hexArray = new String[] {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
    public static String hex = "0123456789abcdef";

    public static String toHex(String binaryNumber) {
        String hexNumber = "";
        String temp = "";
        if(binaryNumber == null || !Pattern.matches("[0-1]+", binaryNumber)) {
            return "";
        }
        int indexLength = binaryNumber.length();
        while (indexLength%4 > 0){
            binaryNumber = "0" + binaryNumber;
            indexLength++;
        }
        for (int i = 0; i < binaryNumber.length(); i++) {
           temp += Character.getNumericValue(binaryNumber.charAt(i));
            if (temp.length() == 4) {
                int index = Arrays.asList(hexArray).indexOf(temp);
                hexNumber += String.valueOf(hex.charAt(index)) ;
                temp = "";
            }
        }
        return hexNumber;
    }

    public static String toBinary(String hexNumber) {
        int index = 0;
        String binaryNumber = "";
        if(hexNumber == null || !Pattern.matches("[0-9A-f]+", hexNumber)) {
            return "";
        }
        for (int i = 0; i < hexNumber.length(); i++) {
            index = hex.indexOf(hexNumber.charAt(i));
            binaryNumber += hexArray[index];
        }
        return binaryNumber;
    }
}