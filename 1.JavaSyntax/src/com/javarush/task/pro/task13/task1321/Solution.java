package com.javarush.task.pro.task13.task1321;

import java.util.Locale;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getTranslationForDayOfWeek("Понедельник"));
        System.out.println(getTranslationForDayOfWeek("Вторник"));
        System.out.println(getTranslationForDayOfWeek("Среда"));
        System.out.println(getTranslationForDayOfWeek("Пятница"));
        System.out.println(getTranslationForDayOfWeek("Высплюсенье"));
    }

    public static String getTranslationForDayOfWeek(String ru) {
        String en;
        if(ru.toLowerCase().equals("понедельник")){
            en = "Monday";
        } else if (ru.equalsIgnoreCase("вторник")){
            en = "Tuesday";
        } else if (ru.equalsIgnoreCase("среда")){
            en = "Wednesday";
        } else if (ru.equalsIgnoreCase("четверг")){
            en = "Thursday";
        } else if ("пятница".equals(ru.toLowerCase())){
            en = "Friday";
        } else if (ru.equalsIgnoreCase("суббота")){
            en = "Saturday";
        } else if (ru.equalsIgnoreCase("воскресенье")){
            en = "Sunday";
        } else {
            en = "Недействительный день недели";
        }
        return en;
    }
}
