package org.example.codes;

import java.util.Objects;

import static java.util.Objects.hash;

public class StringCodes {
    public static void main(String[] args) {
        String str2 = new String("helloworld");
        String str1 = "hello";
        String str3 = str2.intern();
        String str4 = "helloworld";
        System.out.println(str2==str3);
        System.out.println(str2.hashCode());
        System.out.println(str4.hashCode());


    }
}
