package com.algorthim;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> strings = new ArrayList<>();

        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("-1");

        SelectionSort selectionSort = new SelectionSort(strings);

        System.out.println(selectionSort.getObjectList());
        selectionSort.selectionSort();
        System.out.println(selectionSort.getObjectList());
    }
}