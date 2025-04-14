package org.example.functional_interface;

public class DefaultMain implements DefaultdemoInterface{
    @Override
    public void printSomething(String s) {
        System.out.println("Hello " + s);
    }
    //override default method, remove default keyword as it reduces the visibility
    @Override
   public void printSomethingElse(String s) {
        System.out.println("Hello " + s + " from overridden method");
    }
    public static void main(String[] args) {
        DefaultMain defaultMain = new DefaultMain();
        defaultMain.printSomething("Rahi");// implemented method
        defaultMain.printSomethingElse("Rahi");// default method
        DefaultdemoInterface.printSomethingStatic("Rahi");// static method
    }
}
