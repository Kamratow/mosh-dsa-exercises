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

    public void removeAt(int index) {
        if(index <0 || index >= count)
            throw new IllegalArgumentException();

        for (int i = index; i < count; i++)
            items[i] = items[i+1];

        count--;
    }

    public int indexOf(int item) {
        // runtime complexity of O(n)
        for (int i = 0; i < count; i++)
            if(items[i] == item) return i;

        return -1;
    }

    public int max() {
        int maxItem = 0;

        // runtime complexity of O(n)
        for (int i = 0; i < count; i++) {
            if(items[i] > maxItem)
                maxItem = items[i];
        }

        return maxItem;
    }
}
