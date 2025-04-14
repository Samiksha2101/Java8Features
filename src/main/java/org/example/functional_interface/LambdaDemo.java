package org.example.functional_interface;

import java.util.Comparator;
import java.util.function.BiConsumer;

public class LambdaDemo {
    public static void main(String[]args) {
        //Biconsumer is a predefined functional interface which takes 2 args
        BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.println(a + b);
        biConsumer.accept(10, 20);
        Runnable runnable = () -> System.out.println("Hello Sunio");
        runnable.run();

        Comparator<Integer> c = (a, b) -> Integer.compare(a, b);
        Comparator<Integer> c1 = Integer::compare;
        Comparator<String> c2 = (a,b) -> a.compareTo(b);
//    employees.sort(Comparator.comparingInt(e -> e.salary));
    /*Use Collections.sort() → When working with lists (List<T>, e.g., ArrayList, LinkedList).
      Use Arrays.sort() → When working with arrays (int[], String[], Object[]).
      Sorting a List<Employee> using employees.sort((e1, e2) -> Integer.compare(e1.salary, e2.salary));*/
    }
}
