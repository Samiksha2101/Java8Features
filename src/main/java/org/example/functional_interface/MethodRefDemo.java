package org.example.functional_interface;


import java.util.Comparator;

public class MethodRefDemo {
    public static void main(String[]args){
        //Reference to a static method of Test class
        FunctionalInterfaceDemo f = Test::display;
        f.printSomething("Samiksha");
    }
    //A class which has a method to be referenced
    public class Test{
        public static void display(String s) {
            System.out.println("Hello " + s);
        }
    }
}
