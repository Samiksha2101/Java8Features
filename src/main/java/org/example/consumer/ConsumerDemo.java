package org.example.consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args){
        Consumer<Integer> consumer1 = i->System.out.println("Cube of number "+i+" is "+i*i*i);
        consumer1.accept(9);
        Consumer<Integer> consumer2 = i->System.out.println("double of number "+i+" is "+i*2);
        consumer1.andThen(consumer2).accept(5);

        BiConsumer<Integer,Integer>biconsumer = (a,b)->System.out.println((a+b));
        biconsumer.accept(1,9);

    }
}
