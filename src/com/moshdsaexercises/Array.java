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

    private void resizeIfRequired() {
        // If the array is full, resize it
        if (items.length == count) {
            // Create a new array (twice the size)
            int[] newItems = new int[count * 2];

            // Copy all the existing items
            System.arraycopy(items, 0, newItems, 0, count);

            items = newItems;
        }
    }

    public void insert(int item) {
        // runtime complexity of O(n)
        resizeIfRequired();

        // Add the new item at the end
        items[count++] = item;
    }

    public void removeAt(int index) {
        // runtime complexity of O(n)
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
        // runtime complexity of O(n)
        int maxItem = 0;

        // runtime complexity of O(n)
        for (int item : items) {
            if(item > maxItem)
                maxItem = item;
        }

        return maxItem;
    }

    public Array intersect(Array other) {
        // runtime complexity of O(n)
        var intersection = new Array(count);

        for (int item : items)
            if(other.indexOf(item) >= 0)
                intersection.insert(item);

        return intersection;
    }

    public void reverse() {
        // runtime complexity of O(n)
        int[] newItems = new int[count];

        for (int i = 0; i < count; i++)
            newItems[i] = items[count - i - 1];

        items = newItems;
    }

    public void insertAt(int item, int index) {
        // runtime complexity of O(n)
        if(index < 0 || index > count)
            throw new IllegalArgumentException();

        resizeIfRequired();

        for(int i = count - 1; i >= index; i--)
            items[i + 1] = items[i];

        items[index] = item;
        count++;
    }
}
