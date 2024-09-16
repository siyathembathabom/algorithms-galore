package com.algorthims;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> strings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        UserInterface userInterface = new UserInterface(scanner);
        userInterface.start();
    }
}