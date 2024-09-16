package com.algorthims;

import java.util.ArrayList;

public class SelectionSort {
    private ArrayList<Object> objects;

    public SelectionSort(ArrayList<Object> objects) {
        this.objects = objects;
    }

    public ArrayList<Object> getObjectList() {
        return this.objects;
    }

    public void addToTheList(Object object) {
        this.objects.add(object);
    }

    public int indexOfSmallestFrom(ArrayList<Object> objects, int startIndex) {
        Object smallestObject = objects.get(startIndex);
        int index = startIndex;
        for (int i = startIndex; i < this.objects.size(); i++) {
            if (isInteger(smallestObject.toString()) && 
                isInteger(this.objects.get(i).toString())) {
                if (convertToInteger(this.objects.get(i).toString()) < 
                    convertToInteger(smallestObject.toString())) {
                    smallestObject = this.objects.get(i);
                    index = i;
                }
            }
            else {
                if (this.objects.get(i).toString().compareTo(smallestObject.toString()) > 0) {
                    smallestObject = this.objects.get(i);
                }
            }
        }
        return index;
    }


    public boolean isInteger(String userInput) {

        // try/catch block to try change a string input by the user to an int type.
        // and catch a NumberFormatException if it cannot become an int.
        try {
            Integer.parseInt(userInput);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public int convertToInteger(String input) {
        return Integer.parseInt(input);
    }

    public void swap(int index1, int index2) {
        Object temporaryObject = this.objects.get(index1);
        this.objects.set(index1, this.objects.get(index2));
        this.objects.set(index2, temporaryObject);
    }

    public void selectSort() {
        for (int i = 0; i < this.objects.size(); i++) {
            int smallestObject = indexOfSmallestFrom(objects, i);
            swap(smallestObject, i);
        }
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {

        int placeOfSmallest = startIndex;
        int index = startIndex;
        while (index < array.length) {
            if (array[index] < array[placeOfSmallest]) {
                placeOfSmallest = index;
            }
            index = index + 1;
        }
        return placeOfSmallest;
    }

 

    public static void swap(int[] array, int index1, int index2) {
        int valueThatWasAtIndex1 = array[index1];
        array[index1] = array[index2];
        array[index2] = valueThatWasAtIndex1;
    }

 

    public static void sort(int[] array) {
        int index = 0;
        while (index < array.length - 1) {
            int smallestAt = indexOfSmallestFrom(array, index);
            swap(array, index, smallestAt);
            index = index + 1;

        }
    }
}