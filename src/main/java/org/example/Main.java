package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] arr = {1, 2, 3, 4, 5};
        List<Integer> list1 = List.of(1, 2, 3, 4, 5);
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
//        System.out.println(Arrays.stream(arr).sum());
        System.out.println(list.stream().max((a,b)->a.compareTo(b)).get());
//        list.add(6);
        System.out.println(arr);

    }
}