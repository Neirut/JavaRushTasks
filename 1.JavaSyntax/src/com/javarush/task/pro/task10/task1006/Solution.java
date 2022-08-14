package com.javarush.task.pro.task10.task1006;

/* 
Кто тут наследник?
*/

public class Solution {
    public static void main(String[] args) {
        Person person = new Person("Oleg");
        System.out.println(person.getName());
        person.setName("Petr");
        System.out.println(person.getName());

    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}