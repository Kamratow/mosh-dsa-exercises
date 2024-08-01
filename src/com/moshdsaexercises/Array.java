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
        for (int item : items) {
            if(item > maxItem)
                maxItem = item;
        }

        return maxItem;
    }

    public Array intersect(Array other) {
        var intersection = new Array(count);

        for (int item : items)
            if(other.indexOf(item) >= 0)
                intersection.insert(item);

        return intersection;
    }

    public void reverse() {
        int[] reversed = new int[count];
        int reversedIndex = 0;

        for (int i = count -1; i >= 0; i--)
            reversed[reversedIndex++] = items[i];

        items = reversed;
    }
}
