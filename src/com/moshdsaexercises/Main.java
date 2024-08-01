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
        System.out.println("Printing all items from numbers array:");
        numbers.print();
        numbers.removeAt(3);
        Array otherArray = new Array(5);
        otherArray.insert(30);
        otherArray.insert(60);
        otherArray.insert(50);
        otherArray.insert(70);
        System.out.println("Intersect of numbers and otherArray:");
        numbers.intersect(otherArray).print();
        numbers.reverse();
        System.out.println("Reversed numbers:");
        numbers.print();
    }
}