package org.example;

import java.util.ArrayList;
import java.util.List;

public class Tasktwo {

    public static <T, U> List<Object> mergeLists(List<T> list1, List<U> list2) {
        List<Object> mergedList = new ArrayList<>();
        int size = Math.min(list1.size(), list2.size());//find the min size to avoid error


        for (int i = 0; i < size; i++) {
            mergedList.add(list1.get(i));
            mergedList.add(list2.get(i));
        }

        return mergedList;
    }

    public static void main(String[] args) {

        List<Character> list1 = List.of('a', 'b', 'c');
        List<Integer> list2 = List.of(1, 2, 3);
        List<Object> result = mergeLists(list1, list2);
        System.out.println(result);
    }
}


