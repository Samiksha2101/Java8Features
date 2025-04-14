package org.example.functional_interface;
@FunctionalInterface
public interface FunctionalInterfaceDemo {
    void printSomething(String s);
    default void printSomethingElse(String s) {
        System.out.println("Hello " + s);
    }
}
