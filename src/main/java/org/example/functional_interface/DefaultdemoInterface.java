package org.example.functional_interface;

public interface DefaultdemoInterface {
    void printSomething(String s);
    default void printSomethingElse(String s) {
        System.out.println("Hello " + s);
    }
    //static method
    static void printSomethingStatic(String s) {
        System.out.println("Hello " + s);
    }
}
