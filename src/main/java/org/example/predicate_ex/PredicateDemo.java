package org.example.predicate_ex;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args){
        //Predicate is a predefined functional interface
        //It has a single abstract method test()
        Predicate<String> p = s->s.contains("sha");
        System.out.println(p.test("samikshha"));
        Predicate<String> p1 = s->s.length()%2==0;
        System.out.println(p1.or(p).test("disha"));
        System.out.println(p1.negate().test("disha"));

        BiPredicate<String,String>bp=(s1,s2)->s1.contains(s2);
        System.out.println(bp.test("vegetarian","non"));

    }
}
