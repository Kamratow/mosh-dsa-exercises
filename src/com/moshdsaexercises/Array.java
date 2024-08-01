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
        // If the array is full, resize it
        if (items.length == count) {
            // Create a new array (twice the size)
            int[] newItems = new int[count * 2];

            // Copy all the existing items
            System.arraycopy(items, 0, newItems, 0, count);

            items = newItems;
        }

        // Add the new item at the end
        items[count++] = item;
    }
}
