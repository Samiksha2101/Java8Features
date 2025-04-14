package org.example.supplier;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args){
        Supplier<Date> supplier =()-> new Date();
        System.out.println("current date is "+supplier.get());
    }
    //no default methods like andThen
}
