package com.javarush.task.pro.task10.task1009;

/* 
Сравнение строк
*/

public class Solution {

    public static void main(String[] args) {
        Person1 a = new Person1("абвгд", 10);
        Person2 b = new Person2("абвгд", 10);
        System.out.println(a.equalsA(b.age));
    }
        public static class Person1 {
        private String name;
        private int age;
        public Person1 (String name, int age){
            this.name = name;
            this.age = age;
        }

            public boolean equalsA(Object obj) {
                if (this == obj)
                    return true;

                if (obj == null)
                    return false;

                if (!(obj instanceof Person1))
                    return false;

                Person1 person = (Person1) obj;

                return this.name == person.name && this.age == person.age;
            }
    }

    public static class Person2 {
        private String name;
        private int age;

        public Person2(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
