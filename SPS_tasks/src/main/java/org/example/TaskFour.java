package org.example;

import java.util.ArrayList;
import java.util.List;

public class TaskFour {

    // Function to generate the first n Fibonacci numbers
    public static List<Integer> generateFibonacci(int n) {
        List<Integer> fibonacciList = new ArrayList<>();

        // Base cases
        if (n >= 1) fibonacciList.add(0); // First Fibonacci number
        if (n >= 2) fibonacciList.add(1); // Second Fibonacci number

        // Generate Fibonacci numbers iteratively
        for (int i = 2; i < n; i++) {
            int nextFibonacci = fibonacciList.get(i - 1) + fibonacciList.get(i - 2);
            fibonacciList.add(nextFibonacci);
        }

        return fibonacciList; // Return the list of Fibonacci numbers
    }

    public static void main(String[] args) {
        // Generate the first 100 Fibonacci numbers
        List<Integer> fibonacciNumbers = generateFibonacci(100);

        // Output the Fibonacci numbers
        System.out.println("The first 100 Fibonacci numbers:");
        for (int number : fibonacciNumbers) {
            System.out.print(number + " ");
        }
    }
}

