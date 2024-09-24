package org.example;
import java.util.*;

public class TaskThree {

    public static String largestNumber(List<Integer> numbers) {
        // Convert the list of integers to a list of strings
        List<String> numStrs = new ArrayList<>();
        for (Integer number : numbers) {
            numStrs.add(String.valueOf(number));
        }

        // Sort the strings with a custom comparator
        Collections.sort(numStrs, (a, b) -> (b + a).compareTo(a + b));

        // If the largest number is "0", the entire number is 0
        if (numStrs.get(0).equals("0")) {
            return "0";
        }

        // Build the largest number by concatenating sorted strings
        StringBuilder largestNumber = new StringBuilder();
        for (String numStr : numStrs) {
            largestNumber.append(numStr);
        }

        return largestNumber.toString();
    }

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(50, 2, 1, 9);
        String result = largestNumber(numbers);
        System.out.println("Largest possible number: " + result);
    }
}
