package com.algorthim;

import java.util.ArrayList;

public class SelectionSort {
    private ArrayList<Object> objects;

    public SelectionSort(ArrayList<Object> objects) {
        this.objects = objects;
    }

    public ArrayList<Object> getObjectList() {
        return this.objects;
    }

    public int indexOfSmallestFrom(ArrayList<Object> objects, int startIndex) {
        Object smallestObjects = objects.get(startIndex);
        int index = startIndex;
        for (int i = startIndex; i < this.objects.size(); i++) {
            if (smallestObjects.toString().compareTo(this.objects.get(i).toString()) > 0) {
                smallestObjects = this.objects.get(i);
                index = this.objects.indexOf(smallestObjects);
            }
        }
        return index;
    }

    public void swap(int index1, int index2) {
        Object temporaryObject = this.objects.get(index1);
        this.objects.set(index1, this.objects.get(index2));
        this.objects.set(index2, temporaryObject);
    }

    public void selectionSort() {
        for (int i = 0; i < this.objects.size(); i++) {
            int smallestObject = indexOfSmallestFrom(objects, i);
            swap(smallestObject, i);
        }
    }
}
