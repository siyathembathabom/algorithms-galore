package com.algorthims;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private ArrayList<Object> objects;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.objects = new ArrayList<>();
    }

    public void start() {
        System.out.println("Welcome to algorthims.\n" + help());
        SelectionSort selectionSort = new SelectionSort(objects);

        while(true) {
            System.out.print("Enter a command: ");
            String userInput = this.scanner.nextLine();

            if (userInput.equalsIgnoreCase("Stop")) {
                break;
            }

            if (userInput.equalsIgnoreCase("Add")) {
                System.out.print("Enter the object you wish to add: ");
                String input = this.scanner.nextLine();
                selectionSort.addToTheList(input);
            }

            if (userInput.equalsIgnoreCase("Print")) {
                System.out.println("Here is the current list: " + selectionSort.getObjectList());
            }

            if (userInput.equalsIgnoreCase("Sort")) {
                selectionSort.selectSort();
                System.out.println("Here is the sorted list: " + selectionSort.getObjectList());
            }

            if (userInput.equalsIgnoreCase("Help")) {
                System.out.println(help());
            }
        }
    }

    public String help() {
        return "Add - adds to the list\n" + "Print - prints the current list" +
            "Sort - sorts the list\n" + "Help - return help menu" +
            "Stop - stops the program\n";
    }
}
