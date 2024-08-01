package com.moshdsaexercises;

public class Main {
    public static void main(String[] args) {
        Array numbers = new Array(3);
        numbers.print();
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insert(50);
//        numbers.removeAt(2);
        System.out.println("Index of 20: " + numbers.indexOf(20));
        System.out.println("Max item value: " + numbers.max());
        System.out.println("Printing all items from array:");
        numbers.print();
    }
}