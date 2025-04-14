package org.example.predicate_ex;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args){
        //Function is a predefined functional interface
        //It has a single abstract method apply()
        //It takes one argument and returns a value
        //It is used to perform some operation on the input and return the result
        Function<Integer,Integer> f1 = i->i*2;
        Function<Integer,Integer> f2 = i->i*i;

        System.out.println(f1.andThen(f2).apply(5));
        System.out.println(f1.compose(f2).apply(5));

        BiFunction<Integer,Integer,Integer> f3 = (a,b)->a*b;
        System.out.println(f3.apply(4,10));

    }
}
