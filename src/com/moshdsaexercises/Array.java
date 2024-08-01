package com.moshdsaexercises;

public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }
    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

    public void insert(int item) {
        count+= 1;
        int[] newItems = new int[count];

        for(int i = 0; i < count; i++) {
            if(i != count - 1) {
                newItems[i] = items[i];
            }

            newItems[i] = item;
        }

        items = newItems;
    }
}
