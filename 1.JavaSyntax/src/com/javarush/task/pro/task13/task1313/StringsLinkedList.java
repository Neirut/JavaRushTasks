package com.javarush.task.pro.task13.task1313;

public class StringsLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement) != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        Node node = new Node();
        node.value = value;
        if (first.next == null && last.prev == null){
            first.next = node;
            last.prev = node;
        } else {
            last.prev.next = node;
            node.prev = last.prev;
            last.prev = node;
        }
    }

    public String get(int value) {
        Node index = first.next;
        for (int i = 0; i < value; i++) {
            index = index.next;
        }
        return index.value;
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
