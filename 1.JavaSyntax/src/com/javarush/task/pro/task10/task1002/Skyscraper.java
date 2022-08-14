package com.javarush.task.pro.task10.task1002;

/* 
Построим новый жилой комплекс JavaRush Towers
*/

public class Skyscraper {
    public static final String SKYSCRAPER_WAS_BUILD = "Небоскреб построен.";
    public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT = "Небоскреб построен. Количество этажей - ";
    public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER = "Небоскреб построен. Застройщик - ";

    int unknown = -1;
    int a;
    String b;

    public Skyscraper(){
        this.a = unknown;
        this.b = "неизвестно";
        System.out.println("Небоскреб построен.");
    }
    public Skyscraper(int a){
        this.a = a;
        this.b = "неизвестно";
        System.out.println("Небоскреб построен. Количество этажей - " + a);
    }
    public Skyscraper(String b){
        this.a = unknown;
        this.b = b;
        System.out.println("Небоскреб построен. Застройщик - " + b);
    }

    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
        Skyscraper skyscraperTower = new Skyscraper(50);
        Skyscraper skyscraperSkyline = new Skyscraper("JavaRushDevelopment");
    }
}

