package org.example;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static int sumf( List<Integer> numbers){
        int totalf = 0;
        for (int number : numbers) {
            totalf += number;
        }

        return  totalf;

    }

    public static int sumw(List<Integer> numbers){
        int totalw = 0;
        int i = 0;


        while (i < numbers.size()) {
            totalw += numbers.get(i);
            i++;
        }
        return totalw;
    }

    public static int sumr(List<Integer> numbers,int index){
        if (index >= numbers.size()) {
            return 0;
        }
        //  add the current element to the sum of the rest
        return numbers.get(index) + sumr(numbers, index + 1);


    }

    public static void main(String[] args) {
        //using for loop
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Call the function to calculate the sum
        int total_f = sumf(numbers);

        System.out.println("Sum using foor loop: "+ total_f);
        int total_w = sumw(numbers);
        System.out.println("Sum using while loop: "+ total_w);
        int total_r = sumr(numbers,0);
        System.out.println("Sum using recursion: "+ total_r);
    }
}