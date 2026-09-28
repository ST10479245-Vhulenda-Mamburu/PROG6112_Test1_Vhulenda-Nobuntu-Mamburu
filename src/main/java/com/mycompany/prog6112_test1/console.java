/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog6112_test1;

/**
 *
 * @author emeris
 */
public abstract class console implements IConsoles 
{
        // "protected" fields are visible to subclasses and the same package.
    // Docs: https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
    protected String consoleType;
    protected String storeName;
    protected int totalSales;

    // Constructor: runs when an object is created; "this" refers to the current object.
    // Docs: https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html
    //       https://docs.oracle.com/javase/tutorial/java/javaOO/thiskey.html
    public console(String consoleType, String storeName, int totalSales) {
        this.consoleType = consoleType;
        this.storeName = storeName;
        this.totalSales = totalSales;
    }

    // Getters implementing the interface. @Override tells the compiler we are
    // implementing/overriding a method from a parent type (catches typos).
    // Docs: https://docs.oracle.com/javase/tutorial/java/IandI/override.html
    @Override
    public String getConsole() {
        return this.consoleType;
    }

    @Override
    public String getConsoleType() {
        return this.consoleType;
    }

    @Override
    public String getStore() {
        return this.storeName;
    }

    @Override
    public int getTotalSales() {
        return this.totalSales;
    }
}
